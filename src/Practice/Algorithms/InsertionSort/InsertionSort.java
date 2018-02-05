package Practice.Algorithms.InsertionSort;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int []array = {1, 4 ,3 ,5 ,6 ,2};
        int [] array2 = {9 ,8 ,6 ,7 ,3 ,5 ,4 ,1, 2};
        insertionSort(array2);

    }

    public static void insertionSort(int [] a){
        for (int i=1; i<a.length; i++){
            int value = a[i];
            int k = i-1;

            while (k>=0 && value<a[k]){
                a[k+1] = a[k];
                k = k-1;
                System.out.println("K = "+k);
            }
            a[k+1] = value;
            printArray(a);
        }
    }

    public static void printArray(int []a){
        for (int i: a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
