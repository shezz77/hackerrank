package Killer;

/**
 * Created by {Shehzada} on 26-Dec-16.
 * Given an array of integers. find the minimum XOR subarray value in given array.
 */
public class Xor {
    public static void main(String[] args) {
        int arr[] = {10, 25, 37, 11,0,70,25};
        System.out.println("Min subarray XOR is " + minSubarrayXOR(arr));

    }

    public static int minSubarrayXOR(int arr[]) {
        int ans = arr[0];

        for (int i=0; i<arr.length; i++) {
            int curr_xor = 0;
            for (int j=i; j<arr.length; j++) {
                curr_xor = curr_xor ^ arr[j];
                ans = Math.min(ans, curr_xor);
            }
        }
        return ans;
    }
}
