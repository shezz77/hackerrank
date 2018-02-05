package Practice.DaysOfCode;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 24-Dec-16.
 */
public class Student extends Day12Inheritence {
    private int [] scoresArray;

    Student(String firstName, String lastName, int identification, int [] array) {
        super(firstName, lastName, identification);
        scoresArray = array;
    }

    public char calculateGrade(){
        char grade = 0;
        int average = 0;
        int sum = 0;

        for(int i = 0; i<scoresArray.length; i++){
            sum += scoresArray[i];
        }

        if (average >=90 && average <=100){
            grade = 'O';
        }else if (average >=80 && average <=90){
            grade = 'E';
        }else if (average >=70 && average <=80){
            grade = 'A';
        }else if (average >=55 && average <=70){
            grade = 'P';
        }else if (average >=40 && average <=55){
            grade = 'D';
        }else if (average < 40){
            grade = 'T';
        }

        return grade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculateGrade() );
    }
}
