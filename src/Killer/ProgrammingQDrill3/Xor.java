package Killer.ProgrammingQDrill3;

/**
 * Created by {Shehzada} on 26-Dec-16.
 * Given an array of integers. find the minimum XOR subarray value in given array.
 */
public class Xor {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("Min subarray XOR is " + minSubarrayXOR(n));

    }

    public static int minSubarrayXOR(int number) {

        int count =  0;
        for (int i=0; i<number; i++) {
            int a = i ^ number;
            if (a > number){
                count++;
            }

        }
        return count;
    }
}
