package Competitions.WeekOfCode28;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class boatCapacity {
    public static void main(String[] args) {
        int boat = 2;
        int capacity = 1;
        int [] array = {1 ,2, 1, 4, 1};

        int tripCap = boat * capacity;

        System.out.println(isCapable(array, tripCap) ? "YES" : "NO");
    }

    public static boolean isCapable(int a[], int limit) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > limit) {
                return false;
            }

        }
        return true;
    }

}
