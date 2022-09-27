package baekjoon.bronze5;

import java.util.Scanner;

public class B5_11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0 ; i < count ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a, b, a + b);
        }
    }
}
