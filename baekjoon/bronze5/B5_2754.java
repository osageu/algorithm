package baekjoon.bronze5;

import java.util.Scanner;

public class B5_2754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array_grade = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D+", "D0", "D-", "F"};
        double[] array_point = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};

        String grade = sc.next();
        for(int i = 0 ; i < array_grade.length ; i++) {
            if(grade.equals(array_grade[i])) {
                System.out.println(array_point[i]);
            }
        }
    }
}
