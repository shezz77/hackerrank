package Practice.Algorithms.String;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class TwoStringsSharingSubString {
    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = "World";

        int p = 2;

        List<Character> list = new ArrayList<>();
        for (Character c: s1.toCharArray()){
            list.add(c);
        }

        System.out.println(list.toString());
        int count = 0;
        for (Character c: s2.toCharArray()){
            if (list.contains(c)){
                count++;
            }
        }

        System.out.println(count >= p ? "YES" : "NO");
    }
}
