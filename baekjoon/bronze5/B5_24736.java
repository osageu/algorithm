package baekjoon.bronze5;

import java.util.Scanner;

public class B5_24736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d %d",
            sc.nextInt() * 6 + sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt() * 1 + sc.nextInt() * 2,
            sc.nextInt() * 6 + sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt() * 1 + sc.nextInt() * 2
        );
    }
}
