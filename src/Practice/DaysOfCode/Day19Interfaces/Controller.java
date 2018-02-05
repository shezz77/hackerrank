package Practice.DaysOfCode.Day19Interfaces;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        AdvancedArithmetic sa = new AdvanceCalculator();

        int result = sa.divisorSum(number);
        System.out.println(result);
    }
}
