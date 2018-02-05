package Competitions.RokieRank2;

/**
 * Created by {Shehzada} on 12-Feb-17.
 */
import java.util.*;
class MinusArray
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here
        int value = Integer.MAX_VALUE;
        Arrays.sort(a);
        for(int i=1;i<n;i++){
            if(Math.abs((a[i-1]-a[i])) < value)
                value = Math.abs((a[i-1]-a[i]));
        }
        System.out.println(value);
    }
}