package baekjoon.bronze5;

import java.util.Scanner;

public class B5_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if((x * y > 0) && x > 0) {
            System.out.println(1);
        } else if((x * y < 0) && x < 0) {
            System.out.println(2);
        } else if((x * y > 0) && x < 0) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
