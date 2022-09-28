package baekjoon.bronze5;

import java.util.Scanner;

public class B5_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String result = "";
        for(int i = 0 ; i < N / 4 ; i++) {
            result += "long ";
        }
        System.out.println(result + "int");
    }
}
