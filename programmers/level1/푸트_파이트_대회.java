package programmers.level1;

public class 푸트_파이트_대회 {
    public String solution(int[] food) {
        String answer = "";

        StringBuilder left_food = new StringBuilder();
        for(int i = 1 ; i < food.length ; i++) {
            int repeat_times = food[i] / 2;
            for(int j = 0 ; j < repeat_times ; j++) {
                left_food.append(String.valueOf(i));
            }
        }

        answer += left_food.toString();
        answer += "0";
        answer += left_food.reverse().toString();

        return answer;
    }
}
