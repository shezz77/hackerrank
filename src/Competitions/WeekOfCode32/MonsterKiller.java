package Competitions.WeekOfCode32;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by soft on 5/16/2017.
 */
public class MonsterKiller {
    public static void main(String[] args) {
        int [] h = {16,19,7,11,23,8,16};
        int hit = 8;
        int t = 8;
        int count = 0;
        int multiple =hit*t;
        Arrays.sort(h);


//        while (multiple > 0){
//
//        }



        for (int i =0, index=0; i<t; i++,index++){
            System.out.print("kdkd ");
            while (h[index] > 0 ){
                h[index] = h[index] - hit;
//                if (h[index] > 0){
////                    System.out.print("check" + h[i] + " i " + i );
//                    t--;
//                }

            }
            count++;
        }

//        System.out.print(count);

        for (int n: h){
            System.out.println(n);
        }

    }
}
