package baekjoon.bronze5;

import java.math.BigInteger;
import java.util.Scanner;

public class B5_22193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        BigInteger N = sc.nextBigInteger();
        BigInteger M = sc.nextBigInteger();
        System.out.println(N.multiply(M));
    }
}
