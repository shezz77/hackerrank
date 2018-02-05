package Practice.Algorithms.Search;

import java.util.Arrays;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int []array = {1,2,3,4,5,6,7,8,9};
        int start = 0;
        int end = array.length-1;
        int key = 3;
        int resultKey = binarySearch(array, key, start, end);
        System.out.println("Key: "+resultKey);
    }

    public static int binarySearch(int []a, int key, int start, int end){
        System.out.println("Start: "+start+" End: "+end);
        if (end < start){
            System.out.println("Start: "+start+" End: "+end);
            return 0;
        }else {
            //cal mid point
            int mid = (start+end)/2;
            System.out.println("Mid: "+mid);

            if (a[mid] > key){
                return binarySearch(a, key, start, mid-1);
            }else if(a[mid] < key){
                return binarySearch(a, key, mid+1, end);
            }else {
                return mid;
            }
        }
    }
}
