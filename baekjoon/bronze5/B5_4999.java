package baekjoon.bronze5;

import java.util.Scanner;

public class B5_4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jaeHwan = sc.nextLine();
        String doctor = sc.nextLine();
        if(jaeHwan.contains(doctor)) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
