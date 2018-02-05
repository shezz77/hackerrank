package InterestingQuestion;

/**
 * Created by {Shehzada} on 26-Dec-16.
 */
public class Controller {
    public static void main(String[] args) {
        Service service = new Service();

        int [] array = {5, 7, 9, -5, -2, -10 , 2};

        Domain domain = new Domain(array);
        System.out.println("Array");
        domain.display();

        Domain result = service.shifting(domain);
        System.out.println("\n\nArray After Shifting");
        result.display();

        result = service.rightShift(result);
        System.out.println("\n\nArray After Replacing Elements");
        result.display();
    }
}
