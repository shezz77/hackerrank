package Practice.DaysOfCode.Day15LinkedList;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Node head = null;

        for (int i = 0; i<N; i++){
            int element = scanner.nextInt();

            head = Service.insert(head, element);
        }
        Service.display(head);
        System.out.println();

        Service.removeDuplicates(head);

        Service.display(head);

    }
}
