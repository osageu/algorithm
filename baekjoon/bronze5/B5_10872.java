package baekjoon.bronze5;

import java.util.Scanner;

public class B5_10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int criteria = sc.nextInt();
        int result = 1;
        for(int i = 2 ; i <= criteria ; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
