package Practice.Other;

import java.util.Scanner;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String [] array = new String[N];

        for (int i=0; i<N; i++){
            array[i] = scanner.next();
            showDeletionCount(array[i]);
        }
    }

    public static void showDeletionCount(String s){
        int deletionCount = 0;
        for (int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                deletionCount++;
            }
        }
        System.out.println(deletionCount);
    }
}
