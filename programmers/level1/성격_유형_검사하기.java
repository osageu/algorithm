package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 성격_유형_검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        // 0-1. 전체 유형 배열
        String[] type_array = {"R", "T", "C", "F", "J", "M", "A", "N"};

        // 0-2. 유형 짝짓기
        String[] compare_array = {"RT", "CF", "JM", "AN"};

        // 0-3. 점수 배열
        int[] point_array = {3, 2, 1, 0, 1, 2, 3};

        // 1. 각 유형 별 점수 기록용 Map 선언
        Map<String, Integer> survey_map = new HashMap<>();
        for(String index : type_array) {
            survey_map.put(index, 0);
        }

        // 2. choices배열 loop돌면서 각 유형에 점수 채워넣기
        for(int i = 0 ; i < choices.length ; i++) {
            int choices_index = choices[i];
            String survey_index = survey[i];
            String input = "";
            if(choices_index < 4) {
                input = String.valueOf(survey_index.charAt(0));
            }else {
                input = String.valueOf(survey_index.charAt(1));
            }
            survey_map.put(input, survey_map.getOrDefault(input, 0) + point_array[choices_index-1]);
        }

        // 3. 짝지어진 배열을 비교해서 최종 결과 만들기
        for(String index : compare_array) {
            String left_key = String.valueOf(index.charAt(0));
            String right_key = String.valueOf(index.charAt(1));
            int left_value = survey_map.get(left_key);
            int right_value = survey_map.get(right_key);
            if(left_value < right_value) {
                answer += right_key;
            } else if(left_value == right_value) {
                answer += String.valueOf((char)Math.min(index.charAt(0), index.charAt(1)));
            } else {
                answer += left_key;
            }
        }

        return answer;
    }
}
