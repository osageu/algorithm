package baekjoon.bronze5;

import java.util.Scanner;

public class B5_14652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int criteria = sc.nextInt();
        int count = 0;
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < column ; j++) {
                if(criteria == count++) {
                    System.out.printf("%d %d", i, j);
                    break;
                }
            }
        }

    }
}
