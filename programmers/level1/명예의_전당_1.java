package programmers.level1;

import java.util.*;
public class 명예의_전당_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> k_array = new ArrayList<>();

        for(int i = 0 ; i < score.length ; i++) {
            k_array.add(score[i]);
            k_array.sort(Comparator.naturalOrder());
            if(k_array.size() > k) {
                k_array.remove(0);
            }
            answer[i] = k_array.get(0);
        }

        return answer;
    }
}
