package Competitions.CodeSprint8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class GameRank {
    public static void main(String[] args) {
        int [] array = {100 , 100 ,50, 40, 40, 20, 10};
        int [] alice = {5, 25, 50, 120};

        int [] rank = new int[array.length+1];
        int tempRank = 1;
        rank[0] = tempRank;
        for (int i=1; i<array.length; i++){
            if (array[i] != array[i-1]){
                tempRank++;
            }
            rank[i] = tempRank;
        }

        Map<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
        for (int i=0; i<array.length; i++){
            rankMap.put(array[i], rank[i]);
        }

        System.out.println(Arrays.asList(rankMap));






    }
}
