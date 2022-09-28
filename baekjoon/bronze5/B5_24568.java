package baekjoon.bronze5;

import java.util.Scanner;

public class B5_24568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int S = sc.nextInt();
        System.out.println((R * 8 + S * 3) - 28);
    }
}
