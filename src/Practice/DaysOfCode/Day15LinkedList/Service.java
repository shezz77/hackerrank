package Practice.DaysOfCode.Day15LinkedList;


/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Service {
    public static Node insert(Node head, int d){
        if (head == null){
            return new Node(d);
        }else if(head.getNext() == null){
            head.setNext(new Node(d));
        }else {
            insert(head.getNext(), d);
        }

        return head;
    }

    public static void display(Node head){
        Node start = head;
        while (start != null){
            System.out.print(start.getData()+ " ");
            start = start.getNext();
        }
    }

    public static Node removeDuplicates(Node head){
        if (head == null){
            return null;
        }

        Node current = head;
        while (current.getNext() != null){
            if (current.getData() == current.getNext().getData()){
                current.setNext(current.getNext().getNext());
            }else {
                current = current.getNext();
            }
        }

        return head;
    }
}
