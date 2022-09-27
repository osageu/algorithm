package baekjoon.bronze5;

import java.util.Scanner;

public class B5_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        while(sc.hasNext()) {
            String criteria = sc.next();
            System.out.println(String.valueOf(criteria.charAt(0)) + String.valueOf(criteria.charAt(criteria.length()-1)));
        }
        sc.close();
    }
}
