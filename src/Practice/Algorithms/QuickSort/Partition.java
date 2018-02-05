package Practice.Algorithms.QuickSort;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class Partition {
    public static int[] partition(int []a){
        int pivot = a[0];
        int pivotIndex = 0;

        for (int i=1; i < a.length; i++){
            int temp = 0;
            if (a[i] < pivot){
                temp = a[i];
                int j = i;
                while (j>pivotIndex){
                    a[j] = a[--j];
                }
                pivotIndex = j+1;
                a[j] = temp;
            }
        }

        return a;
    }

    public static void printArray(int []a){
        for (int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
