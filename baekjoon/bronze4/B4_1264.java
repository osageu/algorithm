package baekjoon.bronze4;

import java.util.Scanner;

public class B4_1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String letters = sc.nextLine();
            if(letters.equals("#")) {
                break;
            }
            int count = 0;
            for(int i = 0 ; i < letters.length() ; i++) {
                String index = String.valueOf(letters.charAt(i)).toLowerCase();
                if(index.matches("[aeiou]")) {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
