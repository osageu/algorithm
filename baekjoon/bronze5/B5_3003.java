package baekjoon.bronze5;

import java.util.Scanner;

public class B5_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_chess = {1, 1, 2, 2, 2, 8};
        for(int i = 0 ; i < array_chess.length ; i++) {
            int result = array_chess[i] - sc.nextInt();
            if(i != array_chess.length - 1) {
                System.out.print(result + " ");
            } else {
                System.out.print(result);
            }
        }
    }
}
