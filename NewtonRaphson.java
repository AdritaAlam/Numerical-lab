public class NewtonRaphson {

    NewtonRaphson(double a ,double ep){
        System.out.println("=> By using newton raphson root finding method : ");
        double ans = newtonRaphsonMethod(a,ep);
        System.out.println("The required root is :"+String.format("%.5f",ans));
    }
    public static double func(double x){
        return x*x*x - 2*x -5;
    }
    public static double derFunc(double x){
        return 3*x*x-2;
    }

    private double newtonRaphsonMethod(double a,double ep){
//        if (func(a) * func(b)>=0){
//            System.out.println("root doesn't exist in this range");
//            return -999999.99;
//        }
        double Xo=a;
        double h= (func(Xo)/ derFunc(Xo));
        while (Math.abs(h)>=ep){
            h=(func(Xo)/derFunc(Xo));
            Xo=Xo-h;

        }
        return Xo;
    }
}
