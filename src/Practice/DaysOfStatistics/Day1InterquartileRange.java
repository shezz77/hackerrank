package Practice.DaysOfStatistics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by {Shehzada} on 02-Jan-17.
 */
public class Day1InterquartileRange {
    public static void main(String[] args) {
        //int [] numbers = {6 ,12 ,8 ,10, 20, 16};
        //int [] freq = {5 ,4 ,3 ,2 ,1,5};
        int [] numbers = {10 ,40 ,30 ,50, 20};
        int [] freq = {1 ,2 ,3 ,4 ,5};
        int [] result = new int[Arrays.stream(freq).sum()];

        int index = 0;

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j<freq[i]; j++){
                result[index++] = numbers[i];
            }
        }

        Arrays.sort(result);

        double Q1 = findMedian(result, 0, result.length/2-1);
        double Q3 = 0;
        if (result.length%2 == 0){
            Q3 = findMedian(result, result.length/2, result.length-1);
        }else {
            Q3 = findMedian(result, result.length/2+1, result.length-1);
        }


        System.out.println("Q1: "+ Q1 + " Q3: "+ Q3);

        System.out.println(Q3 - Q1);

        for (int i: result){
            System.out.print(i+" ");
        }
    }

    public static double findMedian(int []array, int start, int end){
        int length = end - start +1;
        double med = 0;

        System.out.println("Length"+ length);

        if (length%2 == 0){
            med = (array[start+ length/2-1] + array[start+ length/2])/2;
        }else {
            med = array[start+ length/2];
        }

        return Math.round(med*10)/10.0;
    }

}
