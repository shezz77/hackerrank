package Competitions.RokieRank2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by {Shehzada} on 12-Feb-17.
 */
public class ProblemStatement3 {
    public static void main(String[] args) {
        String s = "hackerworld";
        String hackerrank = "hackerrank";

        Queue<Character> sq = new LinkedList<>();
        Queue<Character> hq = new LinkedList<>();

        for (char c: s.toCharArray()){
            sq.add(c);
        }

        for (char c: hackerrank.toCharArray()){
            hq.add(c);
        }
//        System.out.println("Size"+sq.size());
        boolean flag = false;
//        System.out.println("before "+sq.toString());
//        System.out.println("before "+hq.toString());
        int size = sq.size();
        for (int i=0; i<size; i++){
            char c = sq.remove();
//            System.out.print(" "+c);
//            System.out.print("sizeeeeeeeeeee "+hq.size());
            if (hq.size() == 1){
                flag = true;
                break;
            }else if(c == hq.peek()){
                hq.remove();
            }
        }
//        System.out.println("\nSize "+hq.size());
        System.out.println(flag);
//        System.out.println("After "+sq.toString());
//        System.out.println("After "+hq.toString());
    }
}
