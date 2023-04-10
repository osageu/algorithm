package programmers.level1;

public class 콜라_문제 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while(true) {
            if(n / a == 0) {
                break;
            }
            int changed_cola = b * (n / a);
            answer += changed_cola;
            n = n - (n / a * a) + changed_cola;
        }

        return answer;
    }
}
