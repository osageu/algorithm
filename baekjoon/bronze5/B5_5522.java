package baekjoon.bronze5;

import java.util.Scanner;

public class B5_5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(sc.hasNext()) {
            count += sc.nextInt();
        }
        sc.close();
        System.out.println(count);
    }
}
