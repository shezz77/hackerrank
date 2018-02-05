package Practice.CrackingInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by {Shehzada} on 04-Jan-17.
 */
public class AnagramString {
    public static void main(String[] args) {
        String s1 = "cde";
        String s2 = "abc";

        int answer = CheckDeletion(s1, s2);

        System.out.println(answer);

    }

    public static int CheckDeletion(String s1, String s2){
        int result = 0;
        Map<Character, Integer> counter = new HashMap<>();

        for (char c: s1.toCharArray()){
            int count = counter.containsKey(c) ? counter.get(c) : 0;
            counter.put(c, (count+1));
        }

        for (char c: s2.toCharArray()){
            int count = counter.containsKey(c) ? counter.get(c) : 0;
            counter.put(c, (count-1));
        }

        System.out.println(counter.toString());

        System.out.println(counter.values());

        List<Integer> list = new ArrayList<>(counter.values());

        for (int i: list){
            result += Math.abs(i);
        }
        return result;
    }

}
