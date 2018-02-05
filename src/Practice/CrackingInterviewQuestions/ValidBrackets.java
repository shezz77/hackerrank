package Practice.CrackingInterviewQuestions;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by {Shehzada} on 05-Jan-17.
 */
public class ValidBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c: expression.toCharArray()){
            switch (c){
                case '(' : stack.push(')');
                break;

                case '{' : stack.push('}');
                break;

                case '[' : stack.push(']');
                break;

                default: if (stack.empty() || c != stack.peek())
                    return false;
                System.out.println(stack.toString());
                stack.pop();
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }*/
        String expression = "{{[[(())]]}}";
        System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
    }
}
