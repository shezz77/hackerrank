package Practice.Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by soft on 1/24/2017.
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int []a = {5, 8, 1, 3, 7, 9, 2};

        quickSort(a);

    }

    public static void quickSort(int []a){

    }

    public static void partition(int []a, int l, int r){
        if ((r-1) < 2){
            return;
        }else {
            int pivotIndex = 1;
            int indexArrayList = 0;
            int pivot  = a[1];
            List<Integer> leftArrayList = new ArrayList<>();
            leftArrayList.add(pivot);
            for (int i=l+1; i<r; i++){
                int cur = a[i];
                if (cur < pivot){
                    leftArrayList.add(indexArrayList, cur);
                    indexArrayList++;
                    pivotIndex++;
                }else {
                    leftArrayList.add(cur);
                }
            }

            for (int i=1; i<r; i++){
                a[i] = leftArrayList.get(i-1);
            }
            partition(a, 1, pivotIndex);
            partition(a, pivotIndex+1, r);
            //printArray(Arrays.copyOfRange(a, 1, r));
        }
    }
}
