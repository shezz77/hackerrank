package Competitions.CodeSprint9;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 27-Jan-17.
 */
public class StudentGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            int result = 0;
            if(grade<38){
                System.out.println(grade);
            }else{
                result = (5*(Math.round(grade/5))+5);
                if (result - grade < 3){
                    System.out.println(result);
                }else {
                    System.out.println(grade);
                }
            }
        }
    }
}
