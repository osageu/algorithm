package baekjoon.bronze4;

import java.util.Scanner;

public class B4_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 1 ; i <= N ; i++) {
            String output = "";
            for(int j = 0 ; j < i ; j++) {
                output += "*";
            }
            while(output.length() < N) {
                output = " " + output;
            }
            System.out.println(output);
        }
    }
}
