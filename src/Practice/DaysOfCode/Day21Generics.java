package Practice.DaysOfCode;

/**
 * Created by {Shehzada} on 30-Dec-16.
 */
public class Day21Generics {
    public static void main(String[] args) {
        int [] intArray = {5,4,83,4,5,6,4,8};
        char [] charArray = {'p', 'a' , 'k', 'i', 's' ,'t', 'a' ,'n'};

        printArray(new int[][]{intArray});

    }



    public static <T> void printArray(T [] genArray){

        for (T g: genArray){
            System.out.println(g);
        }


    }
}
