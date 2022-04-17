public class FalsePosition {
    FalsePosition(double a,double b,double ep){
        System.out.println("=> By using false position root finding method :");
        double ans = regularFalseMethod(a,b,ep);
        if (ans == -99999.99){
            System.out.println("Initial guess wrong");
        }
        else
            System.out.println("Required root is " + String.format("%.5f", ans));
    }
    public static double func(double x){
        double v = x * x * x - 2 * x -5;
        return v;
    }

    private double regularFalseMethod(double a, double b, double ep){
        double root = a;
        if (func(a) * func(b)>=0){
            System.out.println("No solution exists");
            return -99999.99;
        }
        int i=0;
        while (i<10000){
            //System.out.println("hello");
            double x= func(b);
            double y = func(a);
           // root = (a * x) / (x - y) - (b * y) / (x - y);
            root =((a*func(b))-(b*func(a)))/(func(b)-func(a));
            if (func(root) == 0)
                break;
            else if (func(a)* func(root)<0){
                b = root;
            }
            else
                a = root;
            i++;
        }
        return root;

    }


}
