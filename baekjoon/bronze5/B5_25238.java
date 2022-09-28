package baekjoon.bronze5;

import java.util.Scanner;

public class B5_25238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double ignore = (a * (b * 0.01));
        if(a - ignore >= 100) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
