package Practice.Other;

/**
 * Created by {Shehzada} on 13-Dec-16.
 */
public class AbsoluteDiff {
    public static void main(String[] args) {
        int n = 6;
        int [] a = {4,6,5,3,3,1};

        int minDiff = 0;

        for (int i = 0; i<a.length-1 ; i++){
            minDiff = Math.max(minDiff, a[i]+a[i+1]);
        }
        System.out.println(minDiff);
    }
}
