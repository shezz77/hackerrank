package Practice.DaysOfStatistics;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class MeanMedianMode {
    public static void main(String[] args) {
        //double [] array = {554,454,356,5,6541,5654,4545,6554,8546,5446};
        double [] array = {64630 ,11735 ,14216 ,99233 ,14470 ,4978 ,73429 ,38120 ,51135 ,67060};
        Arrays.sort(array);
        display(array);

        System.out.println("\nMean: "+ findMean(array));
        System.out.println("Median: "+ findMedian(array));
        System.out.println("Mode: "+ findMode(array));

    }

    public static double findMean(double []a){
        double result = 0;

        double sum = Arrays.stream(a).sum();
        result = sum/a.length;
        return result;
    }

    public static double findMedian(double []a){
        double result = 0;
        if(a.length/2 == 1){
            result = a[a.length/2];
        }else {
            result =  (a[a.length/2] + a[a.length/2 -1])/2;
        }

        return result;
    }

    public static int findMode(double []a){
        double mode = Arrays.stream(a).min().getAsDouble();

        int maxCount = 0;
        for (int i=0; i<a.length; i++){
            int count = 0;
            for (int j=0; j<a.length; j++){
                if (a[i] == a[j]){
                    count++;
                }
            }
            if (maxCount<count){
                maxCount = count;
                mode = a[i];
            }
        }

        return (int)mode;
    }

    public static void display(double [] a){
        for (double i: a){
            System.out.print(i+ " ");
        }
    }
}
