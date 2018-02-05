package Practice.CrackingInterviewQuestions.TaleOfTwoStacks;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 06-Jan-17.
 */
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyQueue<Integer> mq = new MyQueue<>();

        for (int i=0; i<10; i++){
            int choice = sc.nextInt();

            if (choice == 1){
                mq.enqueue(sc.nextInt());
            }else if(choice == 2){
                mq.dequeue();
            }else if (choice == 3){
                System.out.println(mq.peek());
            }
        }
        sc.close();
    }
}
