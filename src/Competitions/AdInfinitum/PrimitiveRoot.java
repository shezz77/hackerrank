package Competitions.AdInfinitum;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrimitiveRoot {

    public static void main(String[] agrs) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();

        for (int i=1; i<a; i++){
            if (!isPrimitive(a, i)){
               list.add(i);
            }
        }

        System.out.println(list.size()+" " + Collections.min(list));

        System.out.print(list.toString());
    }

    public static boolean isPrimitive(int a, int al){
        int t = 1;
        boolean flag = false;
        t = al;
        for (int i = 1; i < a - 1; i++) {
            t = (t * al) % a;
            if (al == t)
                flag = true;
        }

        return flag;
    }

    public static boolean isPrime(int number){
        if (number == 1){
            return false;
        }

        if (number == 2){
            return true;
        }

        for (int i = 2; i*i<=number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}