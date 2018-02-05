package Competitions.WeekOfCode31;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Shehz on 10-Apr-17.
 */
public class BeautifulWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        boolean answer = true;

        Set<Character> vowel = new HashSet<>();

        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('y');

        for (int i=1; i<w.length(); i++){
            if (w.charAt(i) == w.charAt(i-1)){
                answer = false;
                break;

            }else if (vowel.contains(w.charAt(i)) && vowel.contains(w.charAt(i-1))){
                answer = false;
                break;
            }
        }

        System.out.println(answer ? "Yes" : "No");
    }

}
