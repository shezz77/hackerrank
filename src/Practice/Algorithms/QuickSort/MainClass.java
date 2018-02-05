package Practice.Algorithms.QuickSort;

import java.util.regex.Pattern;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class MainClass {
    public static void main(String[] args) {
        int [] array = {5 ,8 ,6 ,7 ,3 ,9 ,4 ,1, 2};
        int [] result = Partition.partition(array);
        Partition.printArray(result);
    }
}
