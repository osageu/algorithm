package programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int answer = 0;

        for(int i = 0 ; i < sizes.length ; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int width = sizes[i][0];
                int height = sizes[i][1];
                sizes[i][0] = height;
                sizes[i][1] = width;
            }
        }

        List<Integer> widthList = new ArrayList<>();
        List<Integer> heightList = new ArrayList<>();
        for(int i = 0 ; i < sizes.length ; i++) {
            widthList.add(sizes[i][0]);
            heightList.add(sizes[i][1]);
        }

        widthList.sort(Comparator.reverseOrder());
        heightList.sort(Comparator.reverseOrder());

        answer = widthList.get(0) * heightList.get(0);

        return answer;
    }
}
