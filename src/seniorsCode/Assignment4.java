package seniorsCode;

/**
 * Created by soft on 4/26/2017.
 */
public class Assignment4 {
    public static void main(String[] args){
        int array[] = {1, 2, 3, 4};
        int array2[] = new int[array.length];


        for(int i =0; i<array.length; i++){
            array2[i] = 1;
            for(int j =0; j<array.length; j++){
                if(j != i){
                    array2[i] = array2[i] * array[j];
                }
            }

            System.out.println(array2[i]);
        }
    }
}
