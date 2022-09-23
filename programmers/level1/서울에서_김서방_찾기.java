package programmers.level1;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        int result = 0;
        for(int i = 0 ; i < seoul.length ; i++) {
            if(seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }

        return answer;
    }
}
