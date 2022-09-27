package baekjoon.bronze5;

import java.util.Scanner;
import java.util.TreeMap;

public class B5_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String criteria = sc.next();
        TreeMap<Character, Integer> map_character_integer = new TreeMap<>();
        String result = "";

        for(int i = 97 ; i <= 122 ; i++) {
            map_character_integer.put((char)i, -1);
        }
        for(int i = 0 ; i < criteria.length() ; i++) {
            char index = criteria.charAt(i);
            if(map_character_integer.get(index) == -1) {
                map_character_integer.put(index, i);
            }
        }
        for(Character index : map_character_integer.keySet()) {
            result += map_character_integer.get(index) + " ";
        }
        StringBuilder sb = new StringBuilder(result);
        sb.deleteCharAt(sb.length()-1);

        System.out.print(sb);
    }
}
