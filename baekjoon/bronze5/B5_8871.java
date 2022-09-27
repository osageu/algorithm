package baekjoon.bronze5;

import java.util.Scanner;

public class B5_8871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int criteria = sc.nextInt() + 1;
        System.out.printf("%d %d", criteria * 2, criteria * 3);
    }
}
