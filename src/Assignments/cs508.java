package Assignments;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by {Shehzada} on 26-Jan-17.
 */
//Solved By SA
public class cs508 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int primeNumber = 0;
        System.out.print("Enter the size(rows and columns) of array: ");
        int n = sc.nextInt();

        System.out.println();

        int [][] array = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                array [i][j] = random.nextInt(90)+10;
            }
        }

        //•	Traversing the array
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(array [i][j]+" ");
                if (isPrime(array[i][j])){
                    primeNumber++;
                }
            }
            System.out.println();
        }

        System.out.println("\nTotal Prime Numbers Found:"+primeNumber);
    }

    public static boolean isPrime(int number){
        boolean flag = true;

        for (int i=2; i<number/2; i++){
            int tmp = number%i;

            if (tmp == 0){
                flag = false;
                break;
            }
        }

        return flag;
    }
}
