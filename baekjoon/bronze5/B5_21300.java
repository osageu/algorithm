package baekjoon.bronze5;

import java.util.Scanner;

public class B5_21300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        while(sc.hasNext()) {
            int index = sc.nextInt();
            result += index * 5;
        }
        sc.close();
        System.out.println(result);
    }
}
