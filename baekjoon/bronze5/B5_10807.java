package baekjoon.bronze5;

import java.util.Scanner;

public class B5_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array_int = new int[sc.nextInt()];
        int result = 0;

        for(int i = 0 ; i < array_int.length ; i++) {
            array_int[i] = sc.nextInt();
        }
        int criteria = sc.nextInt();
        for(int index : array_int) {
            if(index == criteria) {
                result++;
            }
        }
        System.out.println(result);
    }
}
