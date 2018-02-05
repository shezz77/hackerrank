package Competitions.CodeSprint9;

import java.util.*;

/**
 * Created by {Shehzada} on 28-Jan-17.
 */
public class WeightedUniformStrings {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        int value = 1;
        for (char c = 'a'; c<='z'; c++){
            map.put(c, value);
            value++;
        }

        //Set<String> list = new HashSet<>();
        Set<Integer> freq = new HashSet<>();

        String s = "abccddde";
        int len = s.length();

        for (int i=0; i<len; i++){
            char ch = s.charAt(i);
            int val = map.get(ch);
            freq.add(val);
            int sum = val;

            for (int j=i+1; j<len; j++){
                if (ch != s.charAt(j)){
                    break;
                }else {
                    sum += val;
                }
            }

            freq.add(sum);


//            String conc = String.valueOf(ch);
//            for (int j=i+1; j<s.length(); j++){
//                if (ch == s.charAt(j)){
//                    conc += ch;
//                }else {
//                    break;
//                }
//            }
//            list.add(conc);
        }

        //System.out.println(list.toString());

//        List<Integer> freq = new ArrayList<>();
//        for (String subString: list){
//            int val = map.get(subString.charAt(0)) * subString.length();
//            freq.add(val);
//        }

        System.out.println(freq.toString());
        int x = 9;

        if (freq.contains(x)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
