package Competitions.WeekOfCode29;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 23-Feb-17.
 */
public class BigSorting {
    public static void main(String[] args) {

        String[] array = {"31415926535897932384626433832795","1","3","10","5" };

        Arrays.sort(array);

        for (String s: array){
            System.out.println(s);
        }
//        System.out.println(array.toString());
    }
}
