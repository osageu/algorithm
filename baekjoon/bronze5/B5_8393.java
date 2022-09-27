package baekjoon.bronze5;

import java.util.Scanner;

public class B5_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int criteria = sc.nextInt();
        int result = 0;
        for(int i = 1 ; i <= criteria ; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
