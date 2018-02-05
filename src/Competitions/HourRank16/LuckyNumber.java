package Competitions.HourRank16;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 02-Jan-17.
 */
public class LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0; i<n; i++){
            int number = scanner.nextInt();
            if (lucky(number)){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }




    }

    public static boolean lucky(int n){
        boolean b = false;
        if((n%7)%4==0 || (n%4==0 ) || (n%7==0)){
            b = true;
        }

        return b;
    }
}
