package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class BubbleSort {
    public static int[] sort(int [] array){
        String ans = "";
        int totalSwaps = 0;
        for (int i=0; i<array.length; i++){
            int numberOfSwaps = 0;
            for (int j=1; j<array.length; j++){
                if (array[j-1] - array[j] ==1) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    numberOfSwaps++;
                }
            }
            totalSwaps += numberOfSwaps;
            if (numberOfSwaps == 0){
                break;
            }
        }

        System.out.println("Array sorted in "+ totalSwaps + " swaps");
        System.out.println("First Element: "+ array[0]);
        System.out.println("Last Element: "+ array[array.length-1]);
        for (int n: array){
            System.out.print(n + " ");
        }

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] < array[i + 1]) {
                ans = "Yes";
            }
            else {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);

        return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            sort(a);
        }

    }
}
