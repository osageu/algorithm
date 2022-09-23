package programmers.level1;

public class 소수_찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] sosu =new boolean [n+1];

        //2~n번째수를 true로 초기화
        for(int i=2; i<=n ; i++) {
            sosu[i]=true;
        }

        //제곱근 구하기
        for(int i=2; i<=(int)Math.sqrt(n); i++){ //2~루트n까지 검사
            if(sosu[i]){ //i번째의 수가 소수일 때
                for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문)
                    sosu[i*j]=false;
            }
        }

        //소수의 개수 세기
        for(int i =2; i<=n; i++) {
            if(sosu[i]) {
                answer++; }
        }

        return answer;
    }
}
