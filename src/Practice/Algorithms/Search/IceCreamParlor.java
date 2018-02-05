package Practice.Algorithms.Search;

/**
 * Created by {Shehzada} on 07-Jan-17.
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        int money = 4;
        int []flavor = {2,2,4,3};

        int [] ansIndex = new int[2];

        for (int i=0; i<flavor.length; i++){
            for (int j = i+1; j<flavor.length; j++){
                if (flavor[i] + flavor[j]== money){
                    ansIndex[0] = i+1;
                    ansIndex[1] = j+1;
                    break;
                }
            }
        }

       for (int i: ansIndex){
            System.out.print(i+" ");
       }
    }
}
