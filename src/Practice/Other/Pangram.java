package Practice.Other;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = string.toLowerCase();
        boolean isPangram = true;

        String alpha = "abcdefghijklmnolprstuvwxyz";
        for (int i=0; i<alpha.length(); i++){
            if(string.contains(String.valueOf(alpha.charAt(i)))== false){
                isPangram = false;
                break;
            }
        }

        if(isPangram){
            System.out.println("pangram");
        }else {
            System.out.println("not pangram");
        }
    }
}
