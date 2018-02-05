package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 05-Jan-17.
 */
public class Day30BitwiseAnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int a = 0; a < t; a++){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if(((k-1)|k) > n && k%2==0){
                System.out.println(k-2);
            }else{
                System.out.println(k-1);
            }
        }
    }
}
