package programmers.level1;

import java.util.*;

public class 신고_결과_받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        // 0. 유저 정보가 담긴 Map 생성
        Map<String, Integer> users = new LinkedHashMap<String, Integer>();
        for(int i = 0 ; i < id_list.length ; i++) {
            users.put(id_list[i], 0);
        }

        // 1. report 중복제거
        Set<String> removeDuplicated = new LinkedHashSet<String>();
        for(int i = 0 ; i < report.length ; i++) {
            removeDuplicated.add(report[i]);
        }

        // 2. k번 이상 신고된 유저 찾기
        Map<String, Integer> getOrDefaultedList = new HashMap<String, Integer>(); // frodo-2, neo-2
        Map<String, Integer> reportedUsers = new HashMap<>(); // frodo, neo
        Iterator<String> it_0 = removeDuplicated.iterator();
        while(it_0.hasNext()) {
            String index = it_0.next();
            String reportedUser = index.split("\\s+")[1];
            getOrDefaultedList.put(reportedUser, getOrDefaultedList.getOrDefault(reportedUser,0) + 1);
        }

        Iterator<String> it_1 = getOrDefaultedList.keySet().iterator();
        while(it_1.hasNext()) {
            String key = it_1.next();
            Integer value = getOrDefaultedList.get(key);
            if(value >= k) {
                reportedUsers.put(key,0);
            }
        }

        // 3. 메일 횟수 넣기
        Iterator<String> it = removeDuplicated.iterator();
        while(it.hasNext()) {
            String index = it.next();
            String[] array = index.split("\\s+");
            if(reportedUsers.get(array[1]) != null) {
                users.put(array[0], users.getOrDefault(array[0], 0) +1);
            }
        }
        // muzi-2, frodo-1, apeach-1, neo-1

        for(int i = 0 ; i < id_list.length ; i++) {
            Integer value = users.get(id_list[i]);
            answer[i] = value;
        }

        return answer;
    }
}
