package Practice.DaysOfCode.Day17PowerCalculator;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N-- > 0){
            int n = scanner.nextInt();
            int p = scanner.nextByte();

            try {
                int s = Domain.powerCalculator(n, p);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }
}
