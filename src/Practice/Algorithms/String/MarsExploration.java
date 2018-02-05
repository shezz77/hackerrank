package Practice.Algorithms.String;

/**
 * Created by soft on 1/10/2017.
 */
public class MarsExploration {
    public static void main(String[] args) {
        String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";

        System.out.println(countChanges(s));
    }

    public static int countChanges(String message) {
        String sos = "SOS";
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) != sos.charAt(i % 3)) count++;
        }
        return count;
    }


}
