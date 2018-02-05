package Practice.Algorithms.String;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class FunnyString {
    public static void main(String[] args) {
        String s = "bcxz";
        System.out.println(isFunny(s));
    }

    public static boolean isFunny(String s){
        int start = 0 ; int end = s.length()-1;
        boolean b = true;

        for (int i=1, j=s.length()-2; i<s.length() || j>=0; i++,j--){
            int forward = Math.abs((int)s.charAt(i)- s.charAt(i-1));
            int backward = Math.abs((int)s.charAt(j)- s.charAt(j+1));

            if (forward != backward){
                b = false;
            }

        }

        return b;
    }
}
