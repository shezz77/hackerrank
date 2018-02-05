package TestCases;

import java.util.Scanner;

/**
 * Created by SA on 11-Aug-17.
 */
public class PrintOddEven {
    public static void main(String[] args) {
        int limit = 0;
        int choice = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Limit of Table");
        limit = sc.nextInt();

        while (true) {
            System.out.println("Enter Choice\n1 for Even\n2 for Odd\n3 For Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < limit; i += 2) {
                        System.out.println("Even number is: " + i);
                    }
                    break;

                case 2:
                    for (int i = 1; i < limit; i += 2) {
                        System.out.println("Odd number is: " + i);
                    }
                    break;
                case 3:
                    System.exit(1);
                    break;

                default:
                    System.out.println("Wrong choice enter only 1 or 2");
            }
        }
    }
}
