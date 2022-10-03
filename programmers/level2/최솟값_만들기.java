package programmers.level2;

import java.util.Arrays;

public class 최솟값_만들기 {
    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int reverse = B.length-1;
        for(int i = 0 ; i < A.length ; i++) {
            answer += A[i] * B[reverse--];
        }

        return answer;
    }
}
