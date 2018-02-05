package Competitions.WeekOfCode32;

/**
 * Created by soft on 5/16/2017.
 */
public class Duplication {
    public static void main(String[] args) {
        String buildString = "0";

        for (int i=0; i<10; i++){
            String t = "";
            for (int j=0; j<buildString.length(); j++){
                if (buildString.charAt(j) == '0') {
                    t+="1";
                }else {
                    t+="0";
                }
            }
            buildString+=t;
        }
        System.out.println(buildString);
    }
}
