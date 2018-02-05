package Practice.Algorithms.Search;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class SherlockAndArray {
    public static void main(String[] args) {
        int []array = {1, 2, 3, 3};

        int i = 0;
        int sum = 0;
        int j = array.length-1;
        while (i != j){
            if (sum>=0){
                System.out.print("Sum: "+sum);
                sum -= array[j];
                System.out.println(" j: "+array[j]);
                j--;
            }else {
                sum +=  array[i];
                System.out.println("Sum: "+sum+ " i: "+array[i]);
                i++;
            }
        }

        System.out.println(sum == 0 ? "Yes" : "No");
    }
}
