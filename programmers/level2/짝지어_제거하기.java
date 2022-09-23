package programmers.level2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public int solution(String s) {

        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++) {
            char index = s.charAt(i);
            if(!stack.empty() && stack.peek() == index) {
                stack.pop();
            } else {
                stack.push(index);
            }
        }
        if(!stack.empty()) {
            answer = 0;
        } else {
            answer = 1;
        }

        return answer;
    }
}
