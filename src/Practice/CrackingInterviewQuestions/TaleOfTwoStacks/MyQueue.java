package Practice.CrackingInterviewQuestions.TaleOfTwoStacks;

import java.util.Stack;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class MyQueue<T> {
    Stack<T> newestStack = new Stack<T>();
    Stack<T> oldestStack = new Stack<T>();

    public void enqueue(T value){
        newestStack.push(value);
    }

    public T peek(){
        T t = null;
        preparedOld();
        t = oldestStack.peek();
        return t;
    }

    public T dequeue(){
        T t = null;
        preparedOld();
        t = oldestStack.pop();
        return t;
    }

    public void preparedOld(){
        if (oldestStack.isEmpty()){
            while (!newestStack.isEmpty()){
                oldestStack.push(newestStack.pop());
            }
        }
    }

}
