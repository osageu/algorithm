package programmers.level1;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 0;

        int allSum = 0;
        for(int i = 0 ; i < 10 ; i++) {
            allSum += i;
        }

        int arraySum = 0;
        for(int index : numbers) {
            arraySum += index;
        }

        answer = allSum - arraySum;

        return answer;
    }
}
