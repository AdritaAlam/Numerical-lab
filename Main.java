import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Trapezoidal tz = new Trapezoidal(0,1,6);
        //Simpson sp = new Simpson(0,1,4);

        Scanner sample = new Scanner(System.in);
        int n = sample.nextInt();
        double val = sample.nextDouble();
        double X[] = new double[n];
       // double Y[][] = new double[n][n];
        double Y[] = new double[n];
        for (int i=0;i<n;i++) {
            X[i] = sample.nextDouble();
            Y[i] = sample.nextDouble();
            //Y[i][0] = sample.nextDouble();
        }
        //ForwardInterpolation fi = new ForwardInterpolation(n,X,Y,val);
        Lagrange li = new Lagrange(X,Y,val,n);
        //DividedDifference dd = new DividedDifference(n,X,Y,val);
        /*double lb= sample.nextDouble();
        double ub = sample.nextDouble();
        double ep =sample.nextDouble();

        Secant sc = new Secant(lb,ub,ep);
        Bisection bs = new Bisection(lb,ub,ep);

        FalsePosition fp = new FalsePosition(lb,ub,ep);
        NewtonRaphson nr = new NewtonRaphson(lb,ep);*/

        //LeastSquare ls = new LeastSquare(n);
    }
}

