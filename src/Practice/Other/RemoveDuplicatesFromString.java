package Practice.Other;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer string = new StringBuffer(scan.nextLine());

        for (int i=1; i<string.length(); i++){
            if(string.charAt(i)== string.charAt(i-1)){
                string.delete(i-1, i+1);
                i=0;
            }
        }

        if(string.length()== 0){
            System.out.println("Empty String");
        }else{
            System.out.println(string);
        }
    }
}
