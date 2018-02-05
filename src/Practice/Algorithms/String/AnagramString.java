package Practice.Algorithms.String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class AnagramString {
    public static void main(String[] args) {
        String s = "mnop";
        int mid = s.length()/2;

        String []a = {s.substring(0, mid) , s.substring(mid)};
        System.out.println(a[0]);

        System.out.println(checkChanging(a[0], a[1]));
    }

    //Check changing required to convert anagram
    public static int checkChanging(String s1, String s2){
        int counter = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (char c: s1.toCharArray()){
            int count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count+1);
        }

        System.out.println(map.toString());

        for (char c: s2.toCharArray()){
            int count = map.containsKey(c) ? map.get(c) : 0;
            map.put(c, count-1);
        }

        for (Integer i : map.values()){
            counter += Math.abs(i);
        }

        return counter;
    }
}
