package Assignments;

import java.util.Random;
import java.util.Scanner;
/**
 * Created by {Shehzad Aslam} on 27-Jan-17.
 */
public class ArrayTest {
    //2d Array
    int [][]array;

    //Constructor to set array size
    public ArrayTest(int n){
        array = new int[n][n];
    }

    //Main Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size(rows and columns) of array: ");
        int number = scanner.nextInt();

        ArrayTest obj = new ArrayTest(number);
        obj.fillMatrix();
        obj.printArray();
        obj.countPrimes();
    }

    //Flll method to fill 2d array with random numbers
    public void fillMatrix(){
        Random random = new Random();
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                array [i][j] = random.nextInt(90)+10;
            }
        }
    }

    //Count prime number in 2d array
    public void countPrimes(){
        int primeNumber = 0;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                if (isPrime(array[i][j])){
                    primeNumber++;
                }
            }
        }

        System.out.println("\nTotal Prime Numbers Found:"+primeNumber);
    }

    //if a number prime or not
    public boolean isPrime(int number){
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

    //Print the array elements
    public void printArray(){
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array.length; j++){
                System.out.print(array [i][j]+" ");
            }
            System.out.println();
        }
    }
}



