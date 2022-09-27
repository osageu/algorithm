package baekjoon.bronze5;

import java.util.Scanner;

public class B5_3733 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int N = sc.nextInt();
            int S = sc.nextInt();
            System.out.println(S / (N + 1));
        }
    }
}
