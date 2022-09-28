package baekjoon.bronze4;

import java.util.Scanner;

public class B4_2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            if(name.equals("#") && age == 0 && weight == 0) {
                break;
            }

            if(age > 17 || weight >= 80) {
                System.out.printf("%s %s\n", name, "Senior");
            } else {
                System.out.printf("%s %s\n", name, "Junior");
            }

        }
    }
}
