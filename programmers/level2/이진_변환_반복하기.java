package programmers.level2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while(true) {

            // 1. x의 모든 0 제거
            answer[1] += s.length() - s.replaceAll("0", "").length();
            String remove_0 = s.replaceAll("0", "");

            // 2. 변환된 x의 길이값을 이진법으로 변경
            int length = remove_0.length();
            StringBuilder sb = new StringBuilder();
            while(true) {
                if(length == 1) {
                    sb.append("1");
                    break;
                } else if(length == 2) {
                    sb.append("0");
                    sb.append("1");
                    break;
                } else if(length == 3) {
                    sb.append("1");
                    sb.append("1");
                    break;
                }
                if(length % 2 == 0) {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
                length = length / 2;
            }
            answer[0]++;
            s = sb.reverse().toString();
            if(s.equals("1")) {
                break;
            }

        }

        return answer;
    }
}
