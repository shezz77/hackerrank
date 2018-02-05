package Practice.DaysOfCode.Day18StackAndQuoue;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 29-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] array = s.toCharArray();

        StackClass stackChar = new StackClass();
        QuoueClass QC = new QuoueClass();

        for (char c: array){
            stackChar.pushCharacter(c);
            QC.enqueueCharacter(c);
        }

        boolean b = true;
        for (int i=0; i<array.length/2; i++){
            if (stackChar.popCharacter() != QC.dequeueCharacter()){
                b = false;
            }
        }

        System.out.println("The Word, "+ s + ", is " + ((b)? "a palindrome." : "not a palindrome."));
    }
}
