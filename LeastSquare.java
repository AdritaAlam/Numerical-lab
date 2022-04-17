import java.util.Scanner;

public class LeastSquare {
    LeastSquare(int n) {
        System.out.println("=> By using least square for curve fiting : ");
        double ans[] = leastSqr(n);
        System.out.println("the require values : a0 = "+ String.format("%.5f",ans[0]) +" a1 = " +String.format("%.5f",ans[1]));
    }

    private double[] leastSqr(int n) {

        Scanner input = new Scanner(System.in);

        double a[] = new double[2];
        double X[] = new double[n];
        double Y[] = new double[n];
        double sumX = 0;
        double sumY = 0;
        double sumXY = 0;
        double sumXX = 0;
        for (int i = 0; i < n; i++) {
            X[i] = input.nextDouble();
            Y[i] = input.nextDouble();
            sumX += X[i];
            sumY += Y[i];
            sumXY += X[i] * Y[i];
            sumXX += X[i] * X[i];
        }
        double a1 = (n * sumXY -  sumX * sumY) / (n * sumXX - sumX * sumX);
        double a0 = (sumY - a1 * sumX) / n;

        a[0] = a0;
        a[1] = a1;
        return a;
    }
}
