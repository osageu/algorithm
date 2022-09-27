package baekjoon.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class B5_8437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger total = sc.nextBigInteger();
        BigInteger diff = sc.nextBigInteger();
        BigInteger two = new BigInteger("2");

        BigInteger a = (total.add(diff)).divide(two);
        System.out.println(a);
        System.out.println(total.subtract(a));
    }
}
