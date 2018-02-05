package Competitions.WeekOfCode36;

import org.jetbrains.annotations.Contract;

import java.util.Scanner;

/**
 * Created by SA on 05-Feb-18.
 */
public class AcidNaming {
    private static String CHECK_STRING1 = "hydro";
    private static String CHECK_STRING2 = "ic";

    private static String acidNaming(String acid_name) {
        boolean firstCheck = true;
        boolean secondCheck = true;
        String ans = "not an acid";

        for (int i = 0; i<5; i++){
            if (acid_name.charAt(i) != CHECK_STRING1.charAt(i)){
                firstCheck = false;
                break;
            }
        }

        int len = acid_name.length()-2;
        for (int i = 0; i<2; i++){
            if (CHECK_STRING2.charAt(i) != acid_name.charAt(len+i)){
                secondCheck = false;
                break;
            }
        }

        if (firstCheck && secondCheck){
            ans = "non-metal acid";
        }else if (secondCheck) {
            ans = "polyatomic acid";
        }

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
