package Practice.DaysOfCode.Day18StackAndQuoue;


import java.util.Stack;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class StackClass{
    Stack stack = new Stack();

    public void pushCharacter(char c){
        stack.push(c);
    }

    public char popCharacter(){
        return (char) stack.pop();
    }

}
