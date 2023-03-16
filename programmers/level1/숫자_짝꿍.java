package programmers.level1;
import java.util.*;
public class 숫자_짝꿍 {

    public String solution(String X, String Y) {
        String answer = "";

        StringBuilder sb = new StringBuilder();
        int[] x_int_array = new int[10];
        int[] y_int_array = new int[10];

        for(int i = 0 ; i < X.length() ; i++) {
            int x_index = Character.getNumericValue(X.charAt(i));
            x_int_array[x_index]++;
        }

        for(int i = 0 ; i < Y.length() ; i++) {
            int y_index = Character.getNumericValue(Y.charAt(i));
            y_int_array[y_index]++;
        }

        for(int i = 9 ; i >= 0 ; i--) {
            int loop_time = Math.min(x_int_array[i], y_int_array[i]);
            for(int j = 0 ; j < loop_time ; j++) {
                sb.append(String.valueOf(i));
            }
        }

        if(sb.toString().equals("")) {
            sb.append("-1");
        }

        answer = sb.toString();

        if(sb.charAt(0) == '0' && sb.length() > 1) {
            answer = "0";
        }

        return answer;
    }

}
