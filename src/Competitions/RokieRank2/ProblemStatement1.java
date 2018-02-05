package Competitions.RokieRank2;

import java.util.*;

/**
 * Created by {Shehzada} on 11-Feb-17.
 * A flock of birds is flying across the continent. Each bird has a type, and the different types are
 * designated by the ID numbers , , , , and .

 Given an array of integers where each integer describes the type of a bird in the flock, find and print
 the type number of the most common bird. If two or more types of birds are equally common,
 choose the type with the smallest ID number.
 */
public class ProblemStatement1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int types = 0;
        Map<Integer, Integer> map = new HashMap();

        for (int i=5; i>0; i--){
            map.put(i, 0);
        }

        for(int types_i=1; types_i <= n; types_i++){
            int count = 0;
            types = in.nextInt();
            count = map.containsKey(types) ? map.get(types) : 0;
            map.put(types, count+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int key: map.keySet()) {
            if(map.get(key).equals(Collections.max(map.values()))) {
                list.add(key);
            }
        }

        System.out.println(Collections.min(list));
    }
}
