public class ForwardInterpolation {
    ForwardInterpolation(double n, double x[], double y[][], double val) {
        System.out.println("=> By using Newton Forward Interpolation :");
        double ans = forwardIn(n, x, y, val);
        System.out.println("approximate result at point" + val +" is: " + String.format("%.5f", ans));
    }

    private int fact(int f) {
        if (f == 0)
            return 1;
        else
            return f * fact(f - 1);
    }
    private double v(int i, double val, double x[],double u) {
        double s=u;
        for (int j = 1; j < i; j++)
            s = s * ((val - x[j]) / (x[1] - x[0]));
        return s;
    }

    private double forwardIn(double n, double x[], double y[][], double val) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                y[j][i] = y[j + 1][i - 1] - y[j][i - 1];
            }
        }

            for (int i = 0; i < n; i++) {
                System.out.print(String.format(" %.2f", x[i]));
                for (int j = 0; j < n - i; j++) {
                    System.out.print("\t" + String.format("%.2f", y[i][j]));
                }
                System.out.println(("\n"));
            }

            double sum = y[0][0];
            double u = (val - x[0]) / (x[1] - x[0]);

            for (int i = 1; i < n; i++) {
                sum = sum + (( v(i, val, x,u) * y[0][i])/fact(i));
            }
            return sum;

        }
    }
