package Practice.Algorithms.Search;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class Pairs {
    public static void main(String[] args) {
            int []a = {1,5,3,4,2};
            int n = a.length;
            int k = 2;
            int count = 0;

            Set<Integer> set = new HashSet<>();

            for (int i=0; i<n; i++){
                set.add(a[i]);
            }

            System.out.println(set.toString());

            for (int i=0; i<n; i++){
                if (set.contains(k+a[i])){
                    System.out.print(a[i]+" ");
                    count++;
                }
            }

            System.out.println("\n"+count);
    }
}
