package Competitions.WeekOfCode33;

/**
 * Created by Shehz on 12-Jun-17.
 */
public class Minimum {
    public static void main(String[] args) {
        int b[] = {1, 2};
        int a[] = {1, 3};

        int minA = Integer.MAX_VALUE;
        int minIndexA = 0;
        int minB = Integer.MAX_VALUE;
        int minIndexB = 0;

        for (int i=0; i<a.length; i++) {
            if (minA > a[i]){
                minA = a[i];
                minIndexA = i;
            }
        }

        for (int i=0; i<b.length; i++) {
            if (i == minIndexA){
                continue;
            }
            if (minB > b[i]){
                minB = b[i];
                minIndexB = i;
            }
        }

        System.out.println(minB);
        System.out.println(minIndexB);
        System.out.println(minA+minB);
    }
}
