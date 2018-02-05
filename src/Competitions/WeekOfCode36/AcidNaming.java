package Competitions.WeekOfCode36;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

/**
 * Created by SA on 05-Feb-18.
 */
public class AcidNaming {

    private static String acidNaming(String acid_name) {
        String ans = "";

        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
