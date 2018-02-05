package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 20-Dec-16.
 */
public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        String ans="";

        // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
        if(n%2==1 ){
            ans = "Weird";
        }
        else if(n > 2 && n < 6){
            ans = "Weird";
        }else {
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
