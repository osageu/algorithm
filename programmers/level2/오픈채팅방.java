package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {

        List<String> resultList = new ArrayList<>();
        Map<String, String> resultMap = new HashMap<>();

        for(String index : record) {
            String[] sArray = index.split("\\s+");
            if(index.startsWith("Enter")) {
                resultMap.put(sArray[1], sArray[2]);
            }
            else if(index.startsWith("Change")) {
                resultMap.put(sArray[1], sArray[2]);
            }
        }

        for(String index : record) {
            String[] sArray = index.split("\\s+");
            if(index.startsWith("Enter")) {
                resultList.add(resultMap.get(sArray[1]) + "님이 들어왔습니다.");
            }
            else if(index.startsWith("Leave")) {
                resultList.add(resultMap.get(sArray[1]) + "님이 나갔습니다.");
            }
        }

        String[] answer = resultList.toArray(new String[resultList.size()]);

        return answer;
    }
}
