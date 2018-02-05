package Competitions.WeekOfCode28;

import java.util.Scanner;

/**
 * Created by soft on 1/12/2017.
 */
public class FriendShipClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int parents[] = new int[n + 1];
            int sizeOfDisjoint[] = new int[n + 1];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                parents[i] = i;
                sizeOfDisjoint[i] = 1;
            }
            int noOfQueries = sc.nextInt();
            while (noOfQueries-- > 0) {
                String q = sc.next();
                if (q.equalsIgnoreCase("Q")) {
                    System.out.println(sizeOfDisjoint[parents[sc.nextInt()]]);
                } else {
                    int x = sc.nextInt();
                    int y= sc.nextInt();
                    int g = Math.min(x, y);
                    int b = Math.max(x, y);

                    if (parents[g] != parents[b]) {
                        int low = Math.min(parents[g], parents[b]);
                        int high = Math.max(parents[g], parents[b]);
                        for (int i = 0; i < parents.length; i++) {
                            if (parents[i] == high) {
                                parents[i] = low;
                                sizeOfDisjoint[low]++;
                                sizeOfDisjoint[high]--;
                            }
                        }
                    }
                }
            }

        }
    }
    }

