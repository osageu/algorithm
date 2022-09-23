package programmers.level1;

import java.util.*;

public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        // 1. 가장 기본 Map 생성 --> key는 String 배열 원소, value는 n번째에서 뽑아낸 Character
        Map<String, Character> map = new HashMap<>();
        for(String str : strings) {
            char index = str.charAt(n);
            map.put(str, index);
        }

        // 2. value 오름차순으로 정렬하고, value가 같으면 key 오름차순으로 정렬
        // 2-1. Map to List
        List<Map.Entry<String, Character>> list = new LinkedList<>(map.entrySet());

        // 2-2. sort
        Collections.sort(list, new Comparator<Map.Entry<String, Character>>() {
            @Override
            public int compare(Map.Entry<String, Character> o1, Map.Entry<String, Character> o2) {
                int comparision = (o1.getValue() - o2.getValue());
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision; // 비교해서 작은 것이 위(왼쪽)로가게
            }
        });

        answer = new String[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i).getKey();
        }

        return answer;
    }
}
