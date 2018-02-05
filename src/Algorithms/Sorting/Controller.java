package Algorithms.Sorting;


/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        int [] array = {2,5,48,64,24,81,65,7,8, 4,6,84,5,3};

        int [] result = BubbleSort.sort(array);

        for (int i: result){
            System.out.print(i+ " ");
        }


    }
}
