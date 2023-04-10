package programmers.level1;
import java.util.*;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> score_list = new ArrayList<>();
        for(int i = 0 ; i < score.length ; i++) {
            score_list.add(score[i]);
        }
        score_list.sort(Comparator.reverseOrder());

        int baguni = 0;
        for(int i = 0 ; i < score.length / m ; i++) {
            int first = score_list.get(baguni);
            int last = score_list.get(baguni + m - 1);
            answer += Math.min(first, last) * m;
            baguni += m;
        }

        return answer;
    }
}
