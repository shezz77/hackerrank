package Killer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by {Shehzada} on 25-Dec-16.
 */
public class InterestingQuestion {
    public static void main(String[] args) {
        int [] array = {5, 7, 9, -5, -2, -10 , 2};

        List<Integer> positive = movePositiveElement(array);
        List<Integer> negative = moveNegativeElement(array);

        System.out.println(positive.toString());
        System.out.println(negative.toString());
    }

    public static List<Integer> movePositiveElement(int [] array){
        List<Integer> list = new ArrayList<>();
        for (int i: array){
            if(i>=0){
                list.add(i);
            }
        }

        return list;
    }

    public static List<Integer> moveNegativeElement(int [] array){
        List<Integer> list = new ArrayList<>();
        for (int i: array){
            if(i<0){
                list.add(i);
            }
        }

        return list;
    }
}
