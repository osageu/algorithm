package baekjoon.bronze5;

import java.util.Scanner;

public class B5_20492 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        System.out.printf("%d %d", (int)(N * 0.78), (int)(N - (0.2 * N) * 0.22));
    }
}
