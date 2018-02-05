package Practice.Algorithms.Search;

import java.util.TreeSet;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class RadioTransmeters {
    public static void main(String[] args) {
        int tRange = 1;
        int [] houses = {25,8,2,3,4,5};

            TreeSet<Integer> set = new TreeSet<>();
            for (int i: houses){
                set.add(i);
            }

            System.out.println(set.toString());

            //int test = set.pollFirst();
            //int test2 = set.first();
            //int test3 = set.pollFirst();
            System.out.println(set.toString());

            int location = 0;
            int transmitter = 0;

            while (!set.isEmpty()){
                int value = set.pollFirst();
                location = value;
                transmitter++;
                while (!set.isEmpty() && set.first() <= value+tRange){
                    location = set.first();
                    set.pollFirst();
                }
                while (!set.isEmpty() && set.first()-location <= tRange)
                    set.pollFirst();
            }

            System.out.println(transmitter);
    }
}
