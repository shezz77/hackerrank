package Competitions.RokieRank2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by {Shehzada} on 12-Feb-17.
 * Consider an array of integers, . We define the absolute difference between two elements, and (where ),
 * to be the absolute value of .

 Given an array of integers, find and print the minimum absolute difference between any two elements in the array.
 */
public class ProblemStatement2 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
        int [] a= {3, -7, 0};
        int ans = Integer.MAX_VALUE;;
//        for (int i=0; i<a.length; i++){
//            for (int j = i+1; j<a.length; j++ ){
//                int val = a[i] - a[j];
//                val = Math.abs(val);
//                System.out.println("Val "+val+ " ans");
//                ans = Math.min(val, ans);
//            }
//        }

        Arrays.sort(a);
        for (int n: a){
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println(a[1] - a[0]);
    }
}
