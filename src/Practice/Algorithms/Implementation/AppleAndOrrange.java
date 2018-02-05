package Practice.Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class AppleAndOrrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = 2;
        int t = 3;
        int a = 1;
        int b = 5;
        int m = 1;
        int n = 1;
        int count1 = 0;
        int count2 = 0;
        int apple = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple= in.nextInt();
            int distance = a + apple;
            if (distance>= s && distance<= t){
                count1++;
            }

        }

        int orange = 0;
        for(int orange_i=0; orange_i < n; orange_i++){
            orange = in.nextInt();
            int distance = b + orange;
            System.out.println("Dis"+ distance);
            if (distance>= s && distance<= t){
                count2++;
            }
        }

        System.out.println(count1+ " "+ count2);

    }
}
