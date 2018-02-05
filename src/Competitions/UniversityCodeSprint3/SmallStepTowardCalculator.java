package Competitions.UniversityCodeSprint3;

import java.util.Scanner;

/**
 * Created by SA on 01-Oct-17.
 */
public class SmallStepTowardCalculator {
    static int solve(String opr) {
        char[] ch=opr.toCharArray();
        if(ch[1] == '+'){
            int val1 = Character.getNumericValue(ch[0]);
            int val2 =Character.getNumericValue(ch[2]);

            return val1 + val2;
        }
        int val1 = Character.getNumericValue(ch[0]);
        int val2 =Character.getNumericValue(ch[2]);

        return val1 - val2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr = in.next();
        int result = solve(opr);
        System.out.println(result);
        in.close();
    }
}
