package baekjoon.bronze5;

import java.util.Scanner;

public class B5_8370 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            result += n * k;
        }
        System.out.println(result);
    }
}
