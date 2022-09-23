package programmers.level2;

public class 일이사_나라의_숫자 {
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int[] iArr = {4, 1, 2};
        int remain = 0;
        while(true) {

            if(n < 4) {
                sb.append(iArr[n%3]);
                break;
            }else {
                remain = n % 3;
                sb.append(iArr[remain]);
                n = n / 3;
                if(remain == 0) {
                    n = n-1;
                }
                if(n < 3) {
                    sb.append(iArr[n]);
                    break;
                }
            }

        }

        answer = sb.reverse().toString();
        return answer;
    }
}
