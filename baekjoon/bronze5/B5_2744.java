package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letters = sc.next();
        String answer = "";
        for(int i = 0 ; i < letters.length() ; i++) {
            char index = letters.charAt(i);
            if(Character.isUpperCase(index)) {
                answer += (char)(index + 32);
            } else {
                answer += (char)(index - 32);
            }
        }
        System.out.println(answer);
    }
}
