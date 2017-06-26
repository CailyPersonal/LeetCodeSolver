package Solution.No40To79;

/**
 * Created by Caily on 6/19/2017.
 */
public class No50 {

    public double myPow(double x, int n) {
        if(0 == n) return 1;

        Boolean positive = n > 0 ? true : false;
        n = Math.abs(n);

        double num = pow(x, n);

        return positive ? num : 1 / num;
    }

    private double pow(double x, int n){

        if (0 == n) return 1;
        if (1 == n) return x;

        double num;

        if(0 == n % 2){
            num = pow(x, n /2);

            return num * num;
        }else{
            num = pow(x,n/2);
            return num * num * x;
        }
    }
}
