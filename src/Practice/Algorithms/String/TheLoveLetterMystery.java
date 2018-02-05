package Practice.Algorithms.String;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class TheLoveLetterMystery {
    public static void main(String[] args) {
        String s = "dbca";



        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (char c: s.toCharArray()){
            stack.push(c);
            queue.add(c);
        }
        int count = 0;

        while (!stack.isEmpty()){
            char c1 = stack.pop();
            char c2 = queue.remove();
            System.out.println("C1: "+c1+" C2: "+c2);

            while (c1 > c2){
                c1--;
                count++;
            }
        }


        System.out.println(count);
    }
}
