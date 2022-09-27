package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remainder = 0;
        for(int i = 0 ; i < 5 ; i++) {
            int uniqueNumber = sc.nextInt();
            remainder += (int)Math.pow(uniqueNumber,2);
        }
        System.out.println(remainder % 10);
    }
}
