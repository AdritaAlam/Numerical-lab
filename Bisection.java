public class Bisection {

    Bisection(double a,double b,double ep){
        System.out.println("=> By using Bisection root finiding method :");
        double ans = bisectionMethod (a,b,ep);
        if (ans == -99999.99){
            System.out.println("Initial guess wrong");
        }
        else
        System.out.println("Require root is " + String.format("%.5f", ans));
    }
    public static double func(double x){
        double v = x * x * x - 2 * x -5;
        return v;
    }

    private double  bisectionMethod(double a,double b,double ep){
        double root =0;
        if (func(a) * func(b)>0){
            System.out.println("No solution exists");
            return -99999.99;
        }
        while (b-a>=ep){
            root =(a+b)/2;
            if (func(root) == 0.0)
                break;
            else if (func(a)* func(root)<0){
                b=root;
            }
            else
                a= root;
        }
        return root;

    }


}
