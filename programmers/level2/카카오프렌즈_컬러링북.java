package programmers.level2;

public class 카카오프렌즈_컬러링북 {
    boolean[][] check;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int temp_count = 0;

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        check = new boolean[m][n];
        int[][] copy = new int[picture.length][picture[0].length];
        for(int i = 0 ; i < picture.length ; i++) {
            for(int j = 0 ; j < picture[0].length ; j++) {
                copy[i][j] = picture[i][j];
            }
        }

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(copy[i][j] != 0 && !check[i][j]) {
                    numberOfArea++;
                    dfs(i, j, copy);
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, temp_count);
                    temp_count = 0;
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public void dfs(int x, int y, int[][] picture) {

        if(check[x][y]) {
            return;
        }

        check[x][y] = true;

        temp_count++;

        for(int k = 0 ; k < 4 ; k++) {
            int a = x + dx[k];
            int b = y + dy[k];

            if(a < 0 || b < 0 || a >= picture.length || b >= picture[0].length) {
                continue;
            }

            if(picture[x][y] == picture[a][b] && !check[a][b]) {
                dfs(a, b, picture);
            }

        }

    }
}
