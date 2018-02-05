package Competitions.Practice;

import java.util.Scanner;

/**
 * Created by soft on 1/31/2017.
 */
public class NimPlayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();

        while (g-- > 0) {
            int n = sc.nextInt();
            int []s = new int[n];
            for (int i=0; i<n; i++){
                s[i] = sc.nextInt();
            }
            System.out.println(nim(s));
        }

    }

    public static String nim(int a[]){
        int nim_sum  = 0;
        for (int i=0; i<a.length; i++){
            System.out.println(nim_sum + "   " + a[i]);
            nim_sum = nim_sum ^ a[i];
            System.out.println("Sum "+ nim_sum);
        }

        if (nim_sum == 0){
            return "Second";
        }else {
            return "First";
        }
    }
}
