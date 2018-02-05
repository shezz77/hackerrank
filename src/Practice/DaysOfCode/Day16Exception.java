package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Day16Exception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();



        try {
            int i = Integer.parseInt(S);
            System.out.println(i);
        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }

    }
}
