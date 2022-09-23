package programmers.level2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class 행렬_테두리_회전하기 {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] background = new int[rows][columns];
        int number = 1;
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < columns ; j++) {
                background[i][j] = number++;
            }
        }

        for(int i = 0 ; i < queries.length ; i++) {

            int x1 = queries[i][0] - 1;
            int y1 = queries[i][1] - 1;
            int x2 = queries[i][2] - 1;
            int y2 = queries[i][3] - 1;
            int count = rows * columns;

            Set<String> targetSet = new LinkedHashSet<>();
            Set<Integer> indexSet = new LinkedHashSet<>();

            // 1. (x1,y1) -> (x1,y2)
            for(int k = y1 ; k <= y2 ; k++) {
                targetSet.add(x1 + "," + k);
                indexSet.add(background[x1][k]);
                count = Math.min(count, background[x1][k]);
            }

            // 2. (x1,y2) -> (x2,y2)
            for(int k = x1 ; k <= x2 ; k++) {
                targetSet.add(k + "," + y2);
                indexSet.add(background[k][y2]);
                count = Math.min(count, background[k][y2]);
            }

            // 3. (x2,y2) -> (x2,y1)
            for(int k = y2 ; k >= y1 ; k--) {
                targetSet.add(x2 + "," + k);
                indexSet.add(background[x2][k]);
                count = Math.min(count, background[x2][k]);
            }

            // 4. (x2,y1) -> (x1,y1)
            for(int k = x2 ; k >= x1 ; k--) {
                targetSet.add(k + "," + y1);
                indexSet.add(background[k][y1]);
                count = Math.min(count, background[k][y1]);
            }

            List<String> targetList = new ArrayList<>(targetSet);
            List<Integer> tempList = new ArrayList<>(indexSet);
            List<Integer> indexList = new ArrayList<>();
            for(int tmp = 0 ; tmp < tempList.size() ; tmp++) {
                if(tmp == 0) {
                    indexList.add(tempList.get(tempList.size()-1));
                }else{
                    indexList.add(tempList.get(tmp-1));
                }
            }

            for(int z = 0 ; z < targetList.size() ; z++) {
                String index = targetList.get(z);
                int x = Integer.parseInt(index.split(",")[0]);
                int y = Integer.parseInt(index.split(",")[1]);
                background[x][y] = indexList.get(z);
            }

            answer[i] = count;

        }

        return answer;
    }
}
