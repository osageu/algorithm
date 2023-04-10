package programmers.level1;

public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] yaksoo_array = new int[number];

        for(int i = 1 ; i <= number ; i++) {
            for(int j = 1 ; j * j <= i ; j++) {
                if(j * j == i) {
                    yaksoo_array[i-1]++;
                } else if(i % j == 0) {
                    yaksoo_array[i-1]++;
                    yaksoo_array[i-1]++;
                }
            }
            if(yaksoo_array[i-1] > limit) {
                yaksoo_array[i-1] = power;
            }
            answer += yaksoo_array[i-1];
        }

        return answer;
    }
}
