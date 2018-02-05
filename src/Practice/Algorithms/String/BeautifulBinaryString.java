package Practice.Algorithms.String;

/**
 * Created by {Shehzada} on 08-Jan-17.
 */
public class BeautifulBinaryString {
    public static void main(String[] args) {
        String s = "0101010";

        System.out.println(s.length() - s.replace("010","01").length());

        System.out.println(s.replaceAll("010",""));

        System.out.println((s.length() - s.replaceAll("010","").length())/3);




        int count = 0;
        //2nd solution
        for (int i=2; i<s.length(); i++){
            if (s.charAt(i)=='0' && s.charAt(i-2)=='0' && s.charAt(i-1)=='1'){
                i += 2;
                count++;
            }
        }

        System.out.println("2nd: "+count);
    }
}
