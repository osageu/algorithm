package programmers.level2;

import java.util.PriorityQueue;

public class 더_맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> low_queue = new PriorityQueue<>();
        for(int i = 0 ; i < scoville.length ; i++) {
            low_queue.add(scoville[i]);
        }

        boolean end = true;
        while(end) {
            int count = low_queue.size();
            if(count >= 2) {
                if(low_queue.peek() < K) {
                    int lowest = low_queue.poll();
                    int lower = low_queue.poll();
                    low_queue.add(lowest + (lower * 2));
                    answer++;
                }else{
                    end = false;
                }
            }else{
                if(low_queue.peek() < K) {
                    answer = -1;
                    end = false;
                }else{
                    end = false;
                }
            }

        }

        return answer;
    }
}
