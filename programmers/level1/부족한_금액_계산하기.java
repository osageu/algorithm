package programmers.level1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long priceSum = 0;
        for (int i = 1 ; i <= count ; i++) {
            priceSum += i * price;
        }

        if(priceSum <= money) {
            answer = 0;
        } else {
            answer = (long)(priceSum - money);
        }

        return answer;
    }
}
