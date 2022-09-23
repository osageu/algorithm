package programmers.level1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6) {
            answer = false;
            return answer;
        }else {
            for(int i = 0 ; i < s.length() ; i++) {
                if(s.charAt(i) >=58 || s.charAt(i) <=47) {
                    answer = false;
                    return answer;
                }
            }
            return answer;
        }
    }
}
