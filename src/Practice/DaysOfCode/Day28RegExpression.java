package Practice.DaysOfCode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by {Shehzada} on 03-Jan-17.
 */
public class Day28RegExpression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        String regExp = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(regExp);
        List<String> list = new ArrayList<String>();

        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }

        Collections.sort(list);

        for (String s: list){
            System.out.println(s);
        }
    }
}
