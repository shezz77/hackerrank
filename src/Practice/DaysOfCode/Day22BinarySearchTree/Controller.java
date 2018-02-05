package Practice.DaysOfCode.Day22BinarySearchTree;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Node root = null;

        while (N-- > 0){
            int data = scanner.nextInt();
            root = Service.insert(root, data);
        }

        int height = Service.getHeight(root);

        System.out.println(height);

        Service.levelOrder(root);

    }
}
