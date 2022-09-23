package programmers.level2;

public class 타겟_넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        boolean[] visited = new boolean[numbers.length];
        int[] plusMinus = {1, -1};
        int sum = 0;
        permutation(numbers, target, visited, 0, plusMinus, 0);

        return answer;
    }

    public void permutation(int[] numbers, int target, boolean[] visited, int depth, int[] plusMinus, int sum)     {

        if(depth == numbers.length) {
            if(sum == target) {
                answer++;
            }
            return;
        }

        for(int i = 0 ; i < plusMinus.length ; i++) {
            sum += plusMinus[i] * numbers[depth];
            permutation(numbers, target, visited, depth+1, plusMinus, sum);
            sum += plusMinus[i] * numbers[depth] * (-1);
        }

    }
}
