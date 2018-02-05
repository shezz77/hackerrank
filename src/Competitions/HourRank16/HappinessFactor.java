package Competitions.HourRank16;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 02-Jan-17.
 */
public class HappinessFactor {
    public static void main(String[] args) {
        int []array = {3, 3, 654, 45, 3, 3, 3};

        int count = 0;

        Arrays.sort(array);

        for (int i=0; i<array.length; i++){
            if (array[0] == array[i]){
                count++;
            }
        }

        array[0] = array[0]*array[0];

        Arrays.sort(array);

        System.out.println(array[0]);
        if (array[0]== 0){
            System.out.println(0);
        }else
        System.out.println(count);



    }
}
