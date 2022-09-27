package baekjoon.bronze5;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class B5_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue_integer = new PriorityQueue<>();
        Set<Integer> set_integer = new HashSet<>();
        for(int i = 1 ; i <= 30 ; i++) {
            set_integer.add(i);
        }
        while(sc.hasNext()) {
            int index = sc.nextInt();
            set_integer.remove(index);
        }

        for(Integer index : set_integer) {
            queue_integer.add(index);
        }

        while(!queue_integer.isEmpty()) {
            System.out.println(queue_integer.poll());
        }
    }
}
