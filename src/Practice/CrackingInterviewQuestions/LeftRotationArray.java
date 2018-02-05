package Practice.CrackingInterviewQuestions;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 04-Jan-17.
 */
public class LeftRotationArray {
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        if (k >= n) {
            k = k % n;
        }

        if (k == 0) return a;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            if (i + k < n) {
                temp[i] = a[i + k];
            } else {
                temp[i] = a[(i + k) - n];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
