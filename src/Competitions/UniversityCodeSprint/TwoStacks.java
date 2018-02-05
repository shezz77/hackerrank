package Competitions.UniversityCodeSprint;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by {Shehzada} on 19-Feb-17.
 */
public class TwoStacks {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n = 5;
        int m = 4;
        int x = 10;
        Queue<Integer> qA = new LinkedList<>();
        Queue<Integer> qB = new LinkedList<>();
        int moves = 0;
        int sum = 0;

        for(int a_i=0; a_i < n; a_i++){
            qA.add(in.nextInt());
        }

        for(int b_i=0; b_i < m; b_i++){
            qB.add(in.nextInt());
        }

        for (int i=0; i<qA.size()+qB.size(); i++){
            int qAPeek = qA.peek();
            int qBPeek = qB.peek();
            int min = 0;
            if (qAPeek < qBPeek){
                min = qA.remove();
            }else{
                min = qB.remove();
            }

            System.out.println(min);
            System.out.println(sum+min);
            if (sum+min > x){
                break;
            }else {
                sum += min;
                moves++;
            }
        }

        System.out.println(moves);
    }
}
