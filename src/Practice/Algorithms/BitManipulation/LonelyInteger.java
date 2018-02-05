package Practice.Algorithms.BitManipulation;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class LonelyInteger {
    public static void main(String[] args) {
        int [] a = {1, 1, 2, 3, 5, 5};
        Map<Integer, Integer> map = new HashMap<>();

        for (int i: a){
            int count = map.containsKey(i) ? map.get(i) : 0;
            map.put(i, count+1);
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()){
            if (i.getValue()==1){
                System.out.print(i.getKey()+" ");
            }
        }
    }
}
