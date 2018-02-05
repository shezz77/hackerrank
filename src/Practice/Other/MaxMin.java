package Practice.Other;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.LongStream;

public class MaxMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        List<Long> ans = sum(new long[]{a, b, c, d, e});

        System.out.println(Collections.min(ans) + " " + Collections.max(ans));
    }

    public static List<Long> sum(long [] array){
        long sum = LongStream.of(array).sum();
        List<Long> sumArray = new ArrayList<Long>();
        for (int i=0; i<array.length; i++){
            sumArray.add(sum-array[i]);
        }

        return sumArray;

    }
}
