package Competitions.WeekOfCode28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by soft on 1/11/2017.
 */
public class LuckyNumber {
    public static void main(String[] args) {
        String string, sub;
        int i, c, length;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string  = in.nextLine();

        length = string.length();

        System.out.println("Substrings of \""+string+"\" are :-");

        List<Integer> list = new ArrayList<>();
        int count = 0;

        for( c = 0 ; c < length ; c++ )
        {
            for( i = 1 ; i <= length - c ; i++ )
            {
                sub = string.substring(c, c+i);
                int val = Integer.parseInt(sub);
                list.add(val);
                if (val%8 == 0){
                   count++;
                }
            }
        }


        int ans2 = (int) (count% (Math.pow(10, 9)+7));
        System.out.println(ans2);


        //System.out.println(list.toString());
    }
}
