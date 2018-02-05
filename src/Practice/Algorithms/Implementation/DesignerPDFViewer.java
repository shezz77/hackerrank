package Practice.Algorithms.Implementation;

import java.util.HashMap;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class DesignerPDFViewer {
    public static void main(String[] args) {
        int [] height = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5 ,5, 5, 5, 5, 5, 5, 5, 5, 5};
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        for (char c ='a'; c<='z'; c++){
            map.put(c ,height[i]);
            i++;
        }

        String s = "abc";

        int result = 0;
        int max = 0;
        for (int j=0; j<s.length(); j++ ){
            int h = map.get(s.charAt(j));
            max = Math.max(h, max);
        }
        int totalArea = max*s.length();
        System.out.println(totalArea);

    }

}
