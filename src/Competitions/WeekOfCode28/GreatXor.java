package Competitions.WeekOfCode28;

import java.util.Scanner;

/**
 * Created by soft on 1/11/2017.
 */
public class GreatXor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        for (int a0 = 0; a0 < q; a0++) {
            long number = in.nextLong();
            int count = 0;

            for (int i = 1; i < number; i++) {

                long a = i ^ number;
                if (a > number) {
                    System.out.print(i+" ");
                }

            }
            //System.out.println(count);

            //System.out.print(0 ^ 10);
        }
    }
}
