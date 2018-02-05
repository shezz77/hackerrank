package Practice.DaysOfStatistics;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 02-Jan-17.
 */
public class Day1StandardDeviation {
    public static void main(String[] args) {
        int []array = {10,40,30,50,20};

        double mean = Arrays.stream(array).sum() / array.length;
        System.out.println(mean);
        double firstSum = 0;
        double accSum = 0;

        for (int i=0; i<array.length; i++){
            firstSum = Math.abs(array[i] - mean);
            accSum += firstSum*firstSum;
        }

        double answer = Math.sqrt(accSum/array.length);
        System.out.println(Math.round(answer*10)/10.0);
    }
}
