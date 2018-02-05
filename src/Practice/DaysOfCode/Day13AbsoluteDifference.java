package Practice.DaysOfCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Day13AbsoluteDifference {
    public static void main(String[] args) {
        int a[] = {1, 2, 5};

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

    static class Difference {
        private int[] elements;
        private int maximumDifference;

        // Add your code here
        Difference(int [] array){
            elements = array;
        }

        public void computeDifference(){
            int max = Arrays.stream(elements).max().getAsInt();
            int min = Arrays.stream(elements).min().getAsInt();

            maximumDifference = Math.abs(max - min);
        }
    }
}
