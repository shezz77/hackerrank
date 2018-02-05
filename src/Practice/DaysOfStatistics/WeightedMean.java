package Practice.DaysOfStatistics;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class WeightedMean {
    public static void main(String[] args) {
        double [] array = {10,40,30,50,20,10,40,30,50,20};
        double [] array2 = {1, 2, 3, 4, 5,6,7,8,9,10};

        System.out.println(calcWeightedMean(array, array2));

    }

    public static double calcWeightedMean(double [] a, double [] a2){
        double result = 0;
        double sum1 = 0;
        double sum2 = Arrays.stream(a2).sum();

        for (int i=0; i<a.length; i++){
            double tmpSum = a[i] * a2[i];
            sum1 += tmpSum;
        }

        result = sum1/sum2;

        return Math.round(result*10)/10.0;
    }
}
