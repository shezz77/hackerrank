package Competitions.WeekOfCode27;

/**
 * Created by {Shehzada} on 25-Dec-16.
 */
public class HekoNacci {
    public static void main(String[] args) {

        System.out.println(hackonacci(90));


    }

    public static int hackonacci(int q) {
        int s=0;

        if(q==1)

            return 1;

        else if(q==2)

            return 2;

        else if(q==3)

            return 3;

        else

        {

            for(int i=1;i<q;i++)

                s=s+(i*hackonacci(q-i));

        }

        return s;}
}
