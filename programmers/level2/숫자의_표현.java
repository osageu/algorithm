package programmers.level2;

public class 숫자의_표현 {
    int answer = 1;
    public int solution(int n) {

        // 1. 최대 길이 구하기
        int count = 0;
        int max_length = 0;
        for(int i = 1 ; i <= n ; i++) {
            count += i;
            if(count >= n) {
                max_length = i;
                break;
            }
        }

        // 2. maxlength 기준으로 for문
        for(int j = 1 ; j < max_length ; j++) {
            repeat(1, j, n);
        }

        return answer;
    }

    private void repeat(int zero, int j, int n) {
        int temp = zero;
        while(true) {
            zero = temp;
            for(int i = temp ; i < temp + j ; i++) {
                zero += i + 1;
            }
            if(zero > n) {
                break;
            } else if(zero == n) {
                answer++;
                break;
            } else {
                temp++;
            }
        }
    }
}
