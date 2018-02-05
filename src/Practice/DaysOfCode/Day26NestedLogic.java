package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 02-Jan-17.
 */
public class Day26NestedLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] actualReturnDate = new int[3];
        int [] expectedReturnDate = new int[3];

        for (int i=0; i<actualReturnDate.length; i++){
            actualReturnDate[i] = sc.nextInt();
        }

        for (int i=0; i<expectedReturnDate.length; i++){
            expectedReturnDate[i] = sc.nextInt();
        }

        int result = 0;

        int yearsLate = actualReturnDate[2] - expectedReturnDate[2];
        int monthsLate = actualReturnDate[1] - expectedReturnDate[1];
        int daysLate = actualReturnDate[0] - expectedReturnDate[0];

        result = ((yearsLate > 0) ? 10000 : (monthsLate > 0 && yearsLate==0) ? 500*monthsLate : (daysLate > 0 && yearsLate ==0) ? daysLate*15 : 0);

        System.out.println(result);
    }
}
