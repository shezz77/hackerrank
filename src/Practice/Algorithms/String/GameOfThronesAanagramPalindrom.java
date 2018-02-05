package Practice.Algorithms.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class GameOfThronesAanagramPalindrom {
    public static void main(String[] args) {
        String s1 = "cdcdcdcdeeeef";//yes
        String s2 = "cdefghmnopqrstuvw";//No

        System.out.println(checkPalindromeQuality(s1) ? "YES" : "NO");
        System.out.println(checkPalindromeQuality(s2) ? "YES" : "NO");
    }

    public static boolean checkPalindromeQuality(String s){
        Set<Character> set = new HashSet<>();

        for (Character c: s.toCharArray()){
            if (set.contains(c)){
                set.remove(c);
            }else {
                set.add(c);
            }
        }

        return set.size()<=1 ? true : false;
    }
}
