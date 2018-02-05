package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 31-Dec-16.
 */
public class Day25PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (!isPrime(n)){
            System.out.print("Not Prime");
        }else {
            System.out.print("Prime");
        }

    }

    public static boolean isPrime(int number){
        if (number == 1){
            return false;
        }

        if (number == 2){
            return true;
        }

        for (int i = 2; i*i<=number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
