package Practice.Other;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class GemStones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Character> set = convertToSet(scanner.next());

        for (int i=1; i<N; i++){
            set.retainAll(convertToSet(scanner.next()));
        }

        System.out.println(set.size());

    }

    private static Set<Character> convertToSet(String text) {
        Set<Character> set = new HashSet<Character>(26);

        for (char c: text.toCharArray()){
            set.add(Character.valueOf(c));
        }

        return set;
    }
}
