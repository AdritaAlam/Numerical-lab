public class Lagrange {

    Lagrange(double x[],double y[],double val,int n){

        System.out.println("=> By using Lagrange Interpolation formula :");
        double ans = lagrangeInterpolation(x,y,val,n);
        System.out.println("approximate result YP at " + val +" is: " + String.format("%.5f", ans));
    }
    double yp=0;
    private double lagrangeInterpolation(double x[],double y[],double val,int n){
        //double result=1;
        for (int i=0;i<n;i++){
            double result=1;
            for (int j=0;j<n;j++){
                if (i!=j) {
                    result = result * (val - x[j]) / (x[i] - x[j]);
                }

            }
            yp = yp + result * y[i];
        }
        return yp;
    }
}
