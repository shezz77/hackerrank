package Practice.DaysOfCode;

/**
 * Created by {Shehzada} on 23-Dec-16.
 */
public class Day9Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));

    }

    public static int factorial(int n){
        if (n<=1){
            return 1;
        }else
            return n * factorial(n-1);
    }
}
