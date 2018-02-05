package Competitions.CodeSprint8;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class CamelCaseCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String [] array = string.split("[A-Z]");
            System.out.println(array.length);
    }
}
