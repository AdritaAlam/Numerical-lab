public class Trapezoidal {
    Trapezoidal(double Xo , double Xn, double n){
        //n=no.of grids(higher value higher accuracy
        System.out.println("=> By using Trapezoidal rule:");
        double ans = trapezoidalRule(Xo,Xn,n);
        System.out.println("Approximate value of the integral is: " + String.format("%.5f", ans));
    }

    private double func(double x){
        //return 1/(1+x*x);
        return 1/(1+(x*x));
    }
    private double trapezoidalRule(double Xo,double Xn,double n){
        double h=(Xn-Xo)/n;
        double sum= func(Xo)+func(Xn);

        for (int i=1;i<n;i++){
            sum+=2*func(Xo+(i*h));
        }
        return (h/2)*sum;
    }

}
