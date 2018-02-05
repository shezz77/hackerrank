package Practice.DaysOfCode;

/**
 * Created by {Shehzada} on 24-Dec-16.
 */
public class Day12Inheritence {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Day12Inheritence(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }


    public static void main(String[] args) {

    }
}
