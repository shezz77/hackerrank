package Practice.Algorithms.Implementation;

/**
 * Created by {Shehzada} on 09-Jan-17.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        int sOnTime = 0;
        int limit = 9;
        int []array = {13 ,91 ,56 ,-62, 96 ,-5, -84 ,-36 ,-46 ,-13};

        for (int i =0; i<array.length; i++){
            if (array[i] <= 0){
                sOnTime++;
            }
        }

        System.out.println(sOnTime < limit ? "YES" : "NO");
    }
}
