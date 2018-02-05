package Killer;

/**
 * Created by {Shehzada} on 25-Dec-16.
 */
public class IQ2 {
    public static void main(String[] args) {
        int [] array = {5, 7, 9, -5, -2, -10 , 2};

        int [] result = shifting(array);

        System.out.println("Interesting Question1 Answer");
        for (int i: result){
            System.out.print(i+" ");
        }

        int [] ansPart2 = rightShift(result);

        System.out.println("\n\nInteresting Question2 Answer");
        for (int i: result){
            System.out.print(i+" ");
        }

    }

    public static int[] shifting(int [] array){
        int j = 0;
        int ans[] = new int[array.length];

        for (int i = 0; i<array.length; i++){
            if (array[i] >= 0){
                ans[j++] = array[i];
            }
        }

        int k = array.length-1;
        for (int i = array.length-1; i>=0; i--){
            if (array[i] < 0){
                ans[k--] = array[i];
            }
        }

        return ans;
    }

    public static int[] rightShift(int [] a){
        int temp = 0;
        int i = 0;
        while (a[a.length-1] < 0) {
            for (i = a.length - 1; i > 0; i--) {

                temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }
        return a;
    }
}
