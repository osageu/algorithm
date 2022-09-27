package baekjoon.bronze5;

import java.util.Scanner;

public class B5_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sc.nextInt();
        int criteria = sc.nextInt();
        while(sc.hasNext()) {
            int index = sc.nextInt();
            if(index < criteria) {
                sb.append(index + " ");
            }
        }
        sc.close();
        sb.deleteCharAt(sb.length() - 1);
        System.out.print(sb);
    }
}
