package programmers.level2;

import java.util.ArrayList;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer;

        // 정답용 --> 나중에 answer로 변환
        ArrayList<Integer> result = new ArrayList<>();
        int saveIndex = 0;
        while(true) {

            for(int i = 0 ; i < progresses.length ; i++) {
                if(progresses[i] != 0) {
                    progresses[i] += speeds[i];
                }
            }

            int count = 0;

            for(int i = saveIndex ; i < progresses.length ; i++) {
                if(progresses[i] >= 100) {
                    progresses[i] = 0;
                    count++;
                }else {
                    saveIndex = i;
                    break;
                }
            }
            if(count != 0) {
                result.add(count);
            }

            int end = 0;
            for(int a : progresses) {
                end += a;
            }
            if(end == 0) {
                break;
            }

        }

        answer = new int[result.size()];
        for(int i = 0 ; i < answer.length ; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
