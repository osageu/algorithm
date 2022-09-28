package baekjoon.bronze5;

import java.util.Scanner;

public class B5_15727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if(time % 5 == 0) {
            System.out.println(time / 5);
        } else {
            System.out.println(time / 5 + 1);
        }
    }
}
