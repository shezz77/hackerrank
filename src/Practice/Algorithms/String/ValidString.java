package Practice.Algorithms.String;

import java.util.*;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class ValidString {
    public static void main(String[] args) {
        String s = "hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd";
        Map<Character, Integer> map = new HashMap<>();

        for (char c: s.toCharArray()){
            int count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c , count+1);
        }

        System.out.println(map.toString());
        int max = Collections.max(map.values());
        System.out.println(max);
        int min = Collections.min(map.values());
        System.out.println(min);

        System.out.println(min==max ? "Yes": "No");
    }
}
