package Practice.Other;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ss {

    static BigInteger temp = BigInteger.ZERO;
    static BigInteger r = BigInteger.ZERO;
    static BigInteger retsum = BigInteger.ZERO;
    static BigInteger dred = BigInteger.valueOf(100);
    static BigInteger thou = BigInteger.valueOf(1000);
    static BigInteger ten = BigInteger.valueOf(10);
    static BigInteger nine = BigInteger.valueOf(9);
    static BigInteger flagmod = BigInteger.valueOf(1000000006);
    static BigInteger z = BigInteger.valueOf(0);

    public static BigInteger remf(BigInteger rem){
        BigInteger sum = BigInteger.ZERO;
        BigInteger remt = BigInteger.ZERO;
        while(rem.compareTo(z)==1){
            remt = rem.mod(ten);
            sum = sum.add(remt);
            rem = rem.divide(ten);

        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        BigInteger count = BigInteger.valueOf(9*(long)(Math.pow(10,(m-1))));

        for(BigInteger i=BigInteger.valueOf((long)Math.pow(10,(m-1)));i.compareTo(BigInteger.valueOf((long)Math.pow(10,m)))==(-1) ;i=i.add(BigInteger.ONE)){
            temp = i.add(BigInteger.ZERO);
            while( temp.compareTo(dred)==0 || temp.compareTo(dred)==1 ){
                r = temp.mod(thou);
                retsum = remf(r);
                temp = temp.divide(ten);
                if(retsum.compareTo(nine)==1){
                    count = count.subtract(BigInteger.ONE);
                    break;
                }
                else{
                    continue;
                }
            }
        }
        count = count.mod(flagmod);
        System.out.println(count);
    }
}
