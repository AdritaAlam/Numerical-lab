public class Simpson {
    Simpson(double Xo,double Xn,double n){
        System.out.println("=> By using Simpson rule:");
        double ans = simpsonRule(Xo,Xn,n);
        System.out.println("Approximate value of the integral is: " + String.format("%.5f", ans));
    }

    private double func(double x){
        return 1/(1+x);
    }
    private double simpsonRule(double Xo,double Xn,double n){
        double h =(Xn-Xo)/n;
        double sum= func(Xo)+func(Xn);

        for (int i=1;i<n;i++){
            if (i % 2 == 0)
                sum+=2*func(Xo+(i*h));
            else
                sum+=4*func(Xo+(i*h));
        }
        return (h/3)*sum;
    }
}
