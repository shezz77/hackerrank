package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Jan-17.
 */
public class GCD {
    public static void main(String[] args) {
        int array[] = {12, 48, 24, 18};

        int gcd = getGdc(array);
        System.out.println(gcd);
        
    }

    public static int getGdc(int... x) {
        // get the smallest of all <a href="#">number</a> no need to check for higher values
        int smallest = getSmallest(x);

        for(int i = smallest; i >= 1; i--) {
            int j;
            for(j = 0; j < x.length; ++j) {
                if(x[j] % i != 0)
                    break;
            }
            // if we pass through the array with all % == 0 return the value
            if(j == x.length)
                return i;
        }
        // so the only possible is 1
        return 1;
    }

    // return smallest <a href="#">number</a> of an array of int
    public static int getSmallest(int[] x) {
        int smallest = x[0];
        for(int i = 1; i < x.length; ++i) {
            if(x[i] < smallest)
                smallest = x[i];
        }
        return smallest;
    }


}
