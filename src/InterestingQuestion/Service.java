package InterestingQuestion;


/**
 * Created by {Shehzada} on 26-Dec-16.
 */
public class Service{
    public Domain shifting(Domain domain){
        int array[] = domain.getArray();
        int j = 0;
        int ans[] = new int[array.length];

        for (int i = 0; i<array.length; i++){
            if (array[i] >= 0){
                ans[j++] = array[i];
            }
        }

        int k = array.length-1;
        for (int i = array.length-1; i>=0; i--){
            if (array[i] < 0){
                ans[k--] = array[i];
            }
        }

        Domain result = new Domain(ans);

        return result;
    }

    public Domain rightShift(Domain domain){
        int []a = domain.getArray();
        int temp = 0;
        int i = 0;
        while (a[a.length-1] < 0) {
            for (i = a.length - 1; i > 0; i--) {

                temp = a[i];
                a[i] = a[i - 1];
                a[i - 1] = temp;
            }
        }

        domain.setArray(a);
        return domain;
    }
}
