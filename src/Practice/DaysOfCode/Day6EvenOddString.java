package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 20-Dec-16.
 */
public class Day6EvenOddString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String [] sArray = new String[n];

        for (int i=0; i<sArray.length; i++){
            sArray[i] = scanner.next();
            printEvenOddString(sArray[i]);
        }
    }

    public static void printEvenOddString(String s){
        String even = "";
        String odd = "";

        for (int i=0; i<s.length(); i++){
            if (i%2 ==0){
                even += String.valueOf(s.charAt(i));
            }else {
                odd += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(even + " " + odd);
    }
}
