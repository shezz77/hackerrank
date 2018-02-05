package Practice.DaysOfCode.Day18StackAndQuoue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class QuoueClass {
    Queue queue = new LinkedList();

    public void enqueueCharacter(char c){
        queue.add(c);
    }

    public char dequeueCharacter(){
        return (char) queue.remove();
    }
}
