package Practice.DaysOfStatistics;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 31-Dec-16.
 */
public class Day1QuarterliesMedian {
    public static void main(String[] args) {
        int [] array = {3,7,8,5,12,14,21,13,18};

        Arrays.sort(array);

        for (int i: array){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println(median(array, 0, array.length/2-1));
        System.out.println(median(array, 0, array.length-1));
        if (array.length%2 == 0){
            System.out.println(median(array, array.length/2, array.length-1));
        }else {
            System.out.println(median(array, array.length/2+1, array.length-1));
        }

    }

    public static int median(int []array, int start, int end){
        int med = 0;
        int length = end - start+1;

        System.out.println(length +" " + start + " " +end);

        if (length % 2 == 0){
            med = (array[start+length/2] + array[start+length/2-1])/2;
        }else {
            med = array[start+length/2];
        }

        return med;
    }

}
