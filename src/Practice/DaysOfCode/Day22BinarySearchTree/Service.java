package Practice.DaysOfCode.Day22BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Service {
    public static Node insert(Node root, int d){
        if (root == null){
            return new Node(d);
        }else {
            Node cur;
            if (d <= root.data){
                cur = insert(root.getLeft(), d);
                root.setLeft(cur);
            }else {
                cur = insert(root.getRight(), d);
                root.setRight(cur);
            }
        }

        return root;
    }

    public static int getHeight(Node n){
        if(n == null){
            return -1;
        }

        return Math.max(getHeight(n.getLeft()), getHeight(n.getRight()))+1;
    }

    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node current = q.remove();
            System.out.print(current.data+" ");
            if (current.getLeft() != null){
                q.add(current.getLeft());
            }
            if (current.getRight() != null){
                q.add(current.getRight());
            }

        }
    }
}
