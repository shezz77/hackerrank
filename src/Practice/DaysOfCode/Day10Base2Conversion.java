package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 24-Dec-16.
 */
public class Day10Base2Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        String output = Integer.toString(number, 2);

        int counter = 0;
        int max = 1;

        for (int i =0; i<output.length(); i++){
            if(output.charAt(i) == '1'){
                counter++;
            }else{
                counter = 0;
            }
            max = Math.max(counter, max);
        }

        System.out.println(max);
    }
}
