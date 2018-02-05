package Practice.DaysOfCode.Day15LinkedList;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Node {
    private int data;
    private Node next;

    Node(int d){
        data = d;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
