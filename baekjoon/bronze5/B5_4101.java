package baekjoon.bronze5;

import java.util.Scanner;

public class B5_4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int front = sc.nextInt();
            int back = sc.nextInt();
            if(front == 0 && back == 0) {
                break;
            }

            if(front > back) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
