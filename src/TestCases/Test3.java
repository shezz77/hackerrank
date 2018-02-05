package TestCases;

import java.util.Scanner;

/**
 * Created by soft on 1/13/2017.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String string = in.next();
        // your code goes here
        int i, c, length;
        String sub;
        length = n;




        int count = 0;

        for( c = 0 ; c < length ; c++ )
        {
            for( i = 1 ; i <= length - c ; i++ )
            {
                sub = string.substring(c, c+i);
                int val = Integer.parseInt(sub);
                if (val%8 == 0){
                    count++;
                }
            }
        }



        System.out.println(count);



    }
}
