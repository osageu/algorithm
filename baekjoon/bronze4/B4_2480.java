package baekjoon.bronze4;

import java.util.Scanner;

public class B4_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        if(i == j && j == k) {
            System.out.println(10000 + i * 1000);
        } else if(i != j && j != k && k != i) {
            int large = Math.max(i, j);
            large = Math.max(large, k);
            System.out.println(large * 100);
        } else {
            if(i == j) {
                System.out.println(1000 + i * 100);
            } else if(j == k) {
                System.out.println(1000 + j * 100);
            } else {
                System.out.println(1000 + k * 100);
            }
        }
    }
}
