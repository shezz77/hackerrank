package Competitions.WeekOfCode27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by {Shehzada} on 20-Dec-16.
 */
public class TailerShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int[] array = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            array[a_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(array);
        int val = 1;
        int ans = 0;

        for (int i=0; i<array.length; i++){
            if(val * p >= array[i]){
                ans += val;
                val++;
            }else {
                i=i-1;
                val++;
            }
        }


        System.out.println(ans);
    }
}
