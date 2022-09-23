package programmers.level2;

public class 단체사진_찍기 {
    int answer = 0;
    public int solution(int n, String[] data) {

        String[] sArray = {"A", "C", "F", "J", "M", "N", "R", "T"};
        String[] cArray = new String[sArray.length];
        boolean[] visited = new boolean[sArray.length];
        permutation(sArray, cArray, 0, 8, visited, data, n);

        return answer;
    }

    public void permutation(String[] sArray, String[] cArray, int depth, int row, boolean[] visited, String[] data, int n) {

        if(depth == row) {
            String index = "";
            for(int i = 0 ; i < cArray.length ; i++) {
                index += cArray[i];
            }
            boolean check = true;
            for(int i = 0 ; i < n ; i++) {
                char first = data[i].charAt(0);
                char second = data[i].charAt(2);
                int variable = Character.getNumericValue(data[i].charAt(4))+1;
                int abs = Math.abs(index.indexOf(first)-index.indexOf(second));
                switch(data[i].charAt(3)) {
                    case '=' :
                        if(abs != variable) {
                            check = false;
                        }
                        break;
                    case '>' :
                        if(abs <= variable) {
                            check = false;
                        }
                        break;
                    case '<' :
                        if(abs >= variable) {
                            check = false;
                        }
                        break;
                }
                if(!check) {
                    break;
                }
            }
            if(check) {
                answer++;
            }
            return;
        }

        for(int i = 0 ; i < sArray.length ; i++) {
            if(!visited[i]) {
                visited[i] = true;
                cArray[depth] = sArray[i];
                permutation(sArray, cArray, depth+1, row, visited, data, n);
                visited[i] = false;
            }
        }

    }
}
