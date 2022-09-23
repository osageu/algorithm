package programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 소수_만들기 {
    public int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int x = 0 ; x < nums.length-2 ; x++) {
            for(int y = x + 1 ; y < nums.length-1 ; y++) {
                for(int z = y + 1 ; z < nums.length ; z++) {
                    list.add(nums[x] + nums[y] + nums[z]);
                }
            }
        }

        for(int i = 0 ; i < list.size() ; i++) {
            int count = 0;
            for(int j = 1 ; j <= list.get(i) ; j++) {
                if(list.get(i) % j == 0) {
                    count++;
                }
                if(count > 2) {
                    break;
                }
            }
            if(count == 2) {
                answer++;
            }
        }

        return answer;
    }
}
