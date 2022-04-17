public class Secant {
    Secant(double x0,double x1,double ep){

        System.out.println("=> By using Secant method:");
        double ans = secantMethod(x0,x1,ep);
        System.out.println("approximate root  is: " + String.format("%.5f", ans));
    }

    private double func(double x){
        return x*x*x - 2*x -5;
    }
    private double secantMethod(double x0,double x1,double ep) {
        if (func(x0) * func(x1) >= 0) {
            System.out.println("Wrong assumption !");
            return 0;
        }
        double x2 = 0;
        while (Math.abs(x1 - x0) >= ep) {
            x2 = x1 - (((x1 - x0) / (func(x1) - func(x0))) * func(x1));
            x0 = x1;
            x1 = x2;
        }
        return x2;
    }
}
