package InterestingQuestion;

/**
 * Created by {Shehzada} on 26-Dec-16.
 */
public class Domain {
    protected int[] array;

    public Domain(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void display(){
        for (int i: array){
            System.out.print(i+" ");
        }
    }
}
