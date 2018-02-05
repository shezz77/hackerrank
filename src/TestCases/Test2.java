package TestCases;

import java.io.IOException;
import java.util.*;

/**
 * Created by {Shehzada} on 17-Dec-16.
 */
public class Test2 {

        public static void main(String[] args) throws IOException {
            String[] array = {"35","1","3","10","5" };
            List<String> strings = Arrays.asList(array);
            Collections.sort(strings, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
                }

//                int extractInt(String s) {
//                    String num = s.replaceAll("\\D", "");
//                    // return 0 if no digits found
//                    return num.isEmpty() ? 0 : Integer.parseInt(num);
//                }
            });
            System.out.println(strings);
        }
}
