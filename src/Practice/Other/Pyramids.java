package Practice.Other;

public class Pyramids {

    public static void main(String[] args) {
        int N = 6;

        for (int i = N; i >= 0; i--) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = N; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}