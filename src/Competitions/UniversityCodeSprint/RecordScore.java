package Competitions.UniversityCodeSprint;

/**
 * Created by {Shehzada} on 19-Feb-17.
 */
public class RecordScore {
    public static void main(String[] args) {
        int [] score = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int max = score[0];
        int min = score[0];
        int maxCount = 0;
        int minCount = 0;

        for (int i=1; i<score.length; i++){
            if (score[i] > max){
                max = score[i];
                maxCount++;
            }else if(score[i] < min){
                min = score[i];
                minCount++;
            }
        }

        System.out.print(maxCount + " " + minCount);

    }
}
