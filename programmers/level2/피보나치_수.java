package programmers.level2;

import java.util.*;

public class 피보나치_수 {

    public int solution(int n) {
        int answer = 0;

        int sum = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i = 2 ; i < n ; i++) {
            list.add(0);
        }

        // --> size가 n인 list 완성
        for(int i = 0 ; i < n ; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);
        return answer;
    }

}
