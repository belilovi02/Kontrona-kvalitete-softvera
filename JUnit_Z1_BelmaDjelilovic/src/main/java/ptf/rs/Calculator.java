package ptf.rs;

public class Calculator {

    public static long factorial(int n) {
        if(n<0) {
            throw new IllegalArgumentException("Argument cannot be negative");
        }

        if(n==0) {
            return 1;
        }

        long res = n--;

        while(n != 0) {
            res*=n--;
        }

        return res;
    }

}
