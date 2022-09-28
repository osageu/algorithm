package baekjoon.bronze5;

import java.util.Scanner;

public class B5_25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int i = 0 ; i < count ; i++) {
            String index = sc.next();
            if(index.length() >= 6 && index.length() <= 9) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
