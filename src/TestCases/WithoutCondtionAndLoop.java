package TestCases;

/**
 * Created by SA on 20-Aug-17.
 */
public class WithoutCondtionAndLoop {
    final static int START_VALUE = 0;
    final static int END_VALUE = 101;
    static int crashTbl[] = new int[END_VALUE];
    static int globalValue = 0;


    public static void main(String[] args) {
        printThis(START_VALUE);
    }

    static public void printThis(int value) {
        System.out.println(String.valueOf(value));
        globalValue++;

        try {
            int crashVar = crashTbl[globalValue];
            printThis(globalValue);
        } catch (Exception e) { }
    }
}
