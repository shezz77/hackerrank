package Competitions.WeekOfCode33;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shehz on 13-Jun-17.
 */
public class PatternCount {
    public static void main(String[] args) {
        String s = "0000000";
        s += "s";

        String ans=""; // Variable to store the final result
        char ch1,ch2;
        int counter = 0;

        for(int i=0; i<s.length()-1; i++)
        {
            ch1=s.charAt(i); // Extracting the first character
            ch2=s.charAt(i+1); // Extracting the next character

// Adding the first extracted character to the result if the current and the next characters are different

            if(ch1!=ch2)
            {
                ans = ans + ch1;
            }
        }

        for (int i=1; i<ans.length(); i++){
            if (ans.charAt(i) == '0'){
                if (ans.charAt(i-1) == '1' && ans.charAt(i+1) == '1'){
                    counter++;
                }
            }
        }


        System.out.println(ans);
        System.out.println(counter);
    }
}
