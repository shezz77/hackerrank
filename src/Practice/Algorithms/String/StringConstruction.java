package Practice.Algorithms.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class StringConstruction {
    public static void main(String[] args) {
        String s = "abcd";
        String s2 = "abab";

        Set<Character> set = new HashSet<>();
        for (Character c: s.toCharArray()){
            set.add(c);
        }

        System.out.println(set.toString());
    }
}
