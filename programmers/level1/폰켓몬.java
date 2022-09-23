package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;

        int count = nums.length / 2;
        Set<Integer> intSet = new HashSet<>();
        for(int index : nums) {
            intSet.add(index);
        }
        if(count <= intSet.size()) {
            answer = count;
        } else {
            answer = intSet.size();
        }


        return answer;
    }
}
