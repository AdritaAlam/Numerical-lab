public class DividedDifference {

    DividedDifference(double n, double x[], double y[][], double val) {
            System.out.println("=> By using Newton Divided Difference Interpolation :");
            double ans = dividedDiff(n, x, y, val);
            System.out.println("approximate result at point" + val +" is: " + String.format("%.5f", ans));
        }
        private double v(int i, double val, double x[]) {
            double s=1;
            for (int j = 0; j < i; j++)
                s = s * (val - x[j]);
            return s;
        }

        private double dividedDiff(double n, double x[], double y[][], double val) {
        //table
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    y[j][i] = (y[j][i - 1] - y[j+1][i - 1])/(x[j]-x[i+j]);
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
            for (int i = 1; i < n; i++) {
                sum = sum + (v(i, val, x) * y[0][i]);
            }
            return sum;

        }
    }
