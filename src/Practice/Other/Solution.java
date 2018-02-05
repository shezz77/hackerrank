package Practice.Other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.LongStream;

public class Solution {

    public static void main(String[] args) {
        long a = 1;
        long b = 2;
        long c = 3;
        long d = 4;
        long e = 5;

        List<Long> ans = sum(new long[]{a, b, c, d, e});

        System.out.println(Collections.max(ans));
        System.out.println(Collections.min(ans));
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
