package programmers.level1;
import java.util.*;

public class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        Queue<String> card1_queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2_queue = new LinkedList<>(Arrays.asList(cards2));

        for(int i = 0 ; i < goal.length ; i++) {
            String goal_index = goal[i];
            String cards1_index = card1_queue.peek();
            String cards2_index = card2_queue.peek();
            if(cards1_index == null) {
                cards1_index = "";
            }
            if(cards2_index == null) {
                cards2_index = "";
            }
            if(cards1_index.equals(goal_index)) {
                card1_queue.poll();
            } else if(cards2_index.equals(goal_index)) {
                card2_queue.poll();
            } else {
                answer = "No";
                break;
            }
        }

        return answer;
    }
}
