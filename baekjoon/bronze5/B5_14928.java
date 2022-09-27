package baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5_14928 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        long remainder = 0;
        for(int i = 0 ; i < number.length() ; i++) {
            remainder = (remainder * 10 + (number.charAt(i) - '0')) % 20000303;
        }
        System.out.print(remainder);
    }
}
