package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leap_year = sc.nextInt();
        if((leap_year % 4 == 0) && (leap_year % 100 != 0 || leap_year % 400 == 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
