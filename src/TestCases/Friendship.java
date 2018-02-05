package TestCases;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;

/**
 * Created by {Shehzada} on 13-Jan-17.
 */
public class Friendship {
    static List<Set<Integer>> list = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Set<Integer>> list = new LinkedList<>();
        int ans = 0;
        int q = sc.nextInt();

        while (q-- > 0){
            int numberOfStd = sc.nextInt();


            int numberOfRel =sc.nextInt();
            while (numberOfRel-- > 0){
                int result = 0;
                Set<Integer> set1 = new HashSet<>();
                int val1 = sc.nextInt();
                int val2 = sc.nextInt();
                set1.add(val1);
                set1.add(val2);

                //if (list.isEmpty()){
                    list.add(set1);
                //}else {
                 //   disjointSet(set1, val1, val2);
               // }




            }



        }

        System.out.println(list.toString());

    }

    public static void disjointSet(Set<Integer> ss, int v1, int v2){
        for (Set<Integer> s2: list){
            if (!s2.contains(v1) && s2.contains(v2)){
                list.add(ss);
            }else if(!s2.contains(v1)){
                s2.add(v1);
                list.add(s2);
            }else {
                s2.add(v2);
                list.add(s2);
            }
        }
    }
}
