package Practice.Algorithms.Search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class MissingNumbers {
    public static void main(String[] args) {
        int [] a = {203, 204, 205, 206, 207, 203, 204, 205, 206};
        int [] b = {203, 204, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};

        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();

        for (int i: a){
            int count = mapA.containsKey(i) ? mapA.get(i) : 0;
            mapA.put(i, count+1);
        }

        System.out.println(mapA.toString());

        for (int i: b){
            int count = mapB.containsKey(i) ? mapB.get(i) : 0;
            mapB.put(i, count+1);
        }

        System.out.println(mapB.toString());

        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entryB: mapB.entrySet()){
            int val1 = 0;
            int val2 = 0;
            if (mapA.containsKey(entryB.getKey())){
                val1 = entryB.getValue();
                val2 = mapA.get(entryB.getKey());
                if (val1 > val2){
                    int counter = val1 - val2;
                    for (int i=0; i<counter; i++){
                        list.add(entryB.getKey());
                    }
                }

            }else {
                list.add(entryB.getKey());
            }
        }

        System.out.println(list.toString());

        for (Object i: list.toArray()){
            System.out.print(i+" ");
        }
    }
}
