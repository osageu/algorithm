package programmers.level1;

public class 삼총사 {

    static int finalAnswer = 0;
    public int solution(int[] number) {
        int n = number.length;
        boolean[] visited = new boolean[n];
        combination(number, visited, 0, n, 3);
        return finalAnswer;
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            int isThreeMan = 0;
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    isThreeMan += arr[i];
                }
            }
            if(isThreeMan == 0) {
                finalAnswer++;
            }
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

}
