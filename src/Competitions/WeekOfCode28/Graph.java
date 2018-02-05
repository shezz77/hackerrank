package Competitions.WeekOfCode28;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Jan-17.
 */
public class Graph {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(countwalks(n, k));
    }

    public static int countwalks(int v, int k)
    {   int count = 0;
        // Base cases
        if (v == 0) return 1;
        if (v == 1) return 1;
        if (v <= 0) return 0;

        if (v < k) return -1;
        if (v == k) return v;
         return v;



    }
}
