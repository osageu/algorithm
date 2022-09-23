package programmers.level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class 위장 {
    public int solution(String[][] clothes) {

        Map<String, Integer> kindMap = new HashMap<>();
        for(int i = 0 ; i < clothes.length ; i++) {
            String index = clothes[i][1];
            kindMap.put(index, kindMap.getOrDefault(index, 0) + 1);
        }

        int answer = 1;
        Iterator<String> it = kindMap.keySet().iterator();
        while(it.hasNext()) {
            String key = it.next();
            int value = kindMap.get(key) + 1;
            answer *= value;
        }

        answer--;
        return answer;
    }
}
