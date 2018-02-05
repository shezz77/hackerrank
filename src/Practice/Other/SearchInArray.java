package Practice.Other;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class SearchInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int N = scanner.nextInt();
        int ans = 0;

        int [] array = new int[N];
        for (int i=0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }

        for (int i=0; i<array.length; i++){
            if (array[i] == V){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
