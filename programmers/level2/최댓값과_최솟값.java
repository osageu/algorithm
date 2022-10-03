package programmers.level2;

import java.util.Arrays;

public class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";

        // 1. 배열에 담기
        String[] array_string = s.split("\\s");

        // 2. 음수 비교까지 하기 위해 int로 변경
        int[] array_int = new int[array_string.length];
        for(int i = 0 ; i < array_string.length ; i++) {
            array_int[i] = Integer.parseInt(array_string[i]);
        }

        // 3. 배열 오름차순 정렬
        Arrays.sort(array_int);

        // 4. 결과 도출
        answer = array_int[0] + " " + array_int[array_int.length-1];
        return answer;
    }
}
