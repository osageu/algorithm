package baekjoon.bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class B4_2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_int = new int[3];
        for(int i = 0 ; i < 3 ; i++) {
            array_int[i] = sc.nextInt();
        }
        Arrays.sort(array_int);
        System.out.printf("%d %d %d", array_int[0], array_int[1], array_int[2]);
    }
}
