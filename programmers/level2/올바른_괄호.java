package programmers.level2;

public class 올바른_괄호 {
    boolean solution(String s) {
        boolean answer = true;

        if((s.length() % 2 == 1) || s.charAt(s.length()-1) == '(') {
            return answer = false;
        }

        int count = 0;
        for(int i = 0 ; i < s.length() ; i++) {
            char index = s.charAt(i);
            if(index == '(') {
                count++;
            } else if(index == ')') {
                count--;
            }
            if(count < 0) {
                answer = false;
                break;
            }
        }

        if(count != 0) {
            answer = false;
        }

        return answer;
    }
}
