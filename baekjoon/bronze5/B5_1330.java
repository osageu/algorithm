package baekjoon.bronze5;

import java.util.Scanner;

public class B5_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > m) {
            System.out.println(">");
        } else if(n < m) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
