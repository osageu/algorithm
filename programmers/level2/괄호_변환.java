package programmers.level2;

import java.util.Stack;

public class 괄호_변환 {
    public String solution(String p) {
        String answer = "";
        boolean result = check(p);
        if(result) {
            return p;
        } else {
            return repeat(p, answer);
        }
    }

    public String repeat(String p, String answer) {

        if(p.equals("")) {
            return "";
        }

        String[] uv_array = cut(p);
        String u = uv_array[0];
        String v = uv_array[1];

        if(check(u)) {
            if(v.equals("")) {
                return p;
            }
            answer += u;
            answer += repeat(v, "");
        } else {
            answer += turn(u, v);
        }

        return answer;

    }

    // 문자열이 올바른 괄호 문자열인지 확인
    public boolean check(String p) {
        boolean answer = false;
        Stack<Character> stack_char = new Stack<>();
        if(p.length() == 0) {
            return answer;
        }

        for(int i = 0 ; i < p.length() ; i++) {
            char index = p.charAt(i);
            if(stack_char.empty() && index == ')') {
                stack_char.push(index);
                break;
            } else {
                if(!stack_char.empty()) {
                    if(stack_char.peek() == '(' && index == ')') {
                        stack_char.pop();
                    } else {
                        stack_char.push(index);
                    }
                } else {
                    stack_char.push(index);
                }
            }
        }

        if(stack_char.empty()) {
            answer = true;
        }
        return answer;
    }

    // 문자열을 u,v로 쪼개줌
    public String[] cut(String p) {
        String[] result = new String[2];
        String u = "";
        String v = "";

        // 2개씩 끊어가는데 '(', ')' 갯수가 같으면 STOP
        for(int i = 2 ; i <= p.length() ; i += 2) {
            u = p.substring(0, i);
            v = p.substring(i);
            String check = u.replaceAll("\\(","");
            if(check.length() == u.length()/2) {
                break;
            }
        }

        result[0] = u;
        result[1] = v;
        return result;
    }

    // 문자열 뒤집기
    public String turn(String u, String v) {
        StringBuilder sb = new StringBuilder(u);

        String make = "";
        make += "(";

        make += repeat(v, "");

        make += ")";

        sb.deleteCharAt(u.length()-1);
        sb.deleteCharAt(0);

        for(int i = 0 ; i < sb.length() ; i++) {
            if(sb.charAt(i) == '(') {
                sb.setCharAt(i, ')');
            }else{
                sb.setCharAt(i, '(');
            }
        }
        make += sb.toString();

        return make;
    }
}
