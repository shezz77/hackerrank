package Practice.Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class Kangro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if (x1<x2 && v1<v2){
            System.out.println("No");
        }else {
            if (v1!=v2 && (x1-x2)%(v1-v2)==0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }


    }
}
