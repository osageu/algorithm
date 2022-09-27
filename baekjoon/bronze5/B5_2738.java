package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int total = row * column;
        int[] int_array_a = new int[total];
        int[] int_array_b = new int[total];

        for(int i = 0 ; i < total ; i++) {
            int_array_a[i] = sc.nextInt();
        }
        for(int j = 0 ; j < total ; j++) {
            int_array_b[j] = sc.nextInt();
        }
        int enter = 0;
        for(int k = 0 ; k < total ; k++) {
            System.out.print(int_array_a[k] + int_array_b[k]);
            enter++;
            if(enter == row) {
                enter = 0;
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}
