package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;


        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < citations.length ; i++) {
            rpq.add(citations[i]);
        }
        int max = rpq.peek();

        for(int i = 0 ; i <= max ; i++) {
            int up = 0;
            int down = 0;
            for(int j = 0 ; j < citations.length ; j++) {
                if(citations[j] >= i) {
                    up++;
                } else {
                    down++;
                }
            }
            if(up >= i && i >= down) {
                answer = Math.max(answer, i);
            }
        }

        return answer;
    }
}
