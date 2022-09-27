package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 1 ; i <= count ; i++) {
            String star = "";
            for(int j = 0 ; j < i ; j++) {
                star += "*";
            }
            System.out.println(star);
        }
    }
}
