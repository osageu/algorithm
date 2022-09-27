package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gugudan = sc.nextInt();
        for(int i = 1 ; i <= 9 ; i++) {
            System.out.print(gugudan + " * " + i + " = " + gugudan * i);
            System.out.println();
        }
    }
}
