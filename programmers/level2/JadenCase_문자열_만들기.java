package programmers.level2;

public class JadenCase_문자열_만들기 {
    public String solution(String s) {
        String answer = "";

        // 1. 자신 이전 문자와 자신 문자를 비교하여 자신 문자 앞이 공백이면 대문자로 바꾸고 이외의 케이스는 소문자로.
        for(int i = 0 ; i < s.length() ; i++) {
            char index_front = ' ';
            if(i-1 >= 0) {
                index_front = s.charAt(i-1);
            }
            char index_now = s.charAt(i);

            if(index_now == ' ') {
                answer += " ";
            } else if(index_front == ' ' && index_now != ' ') {
                answer += String.valueOf(index_now).toUpperCase();
            } else {
                answer += String.valueOf(index_now).toLowerCase();
            }

        }

        return answer;
    }
}
