package programmers.level1;

public class 문자열_내_p와_y의_개수 {
    public boolean solution(String s) {
        boolean answer = true;

        String ss = s.toLowerCase();
        int resultP = 0;
        int resultY = 0;
        for(int i = 0 ; i < ss.length() ; i++) {
            if(ss.charAt(i) == 'p') {
                resultP++;
            }else if(ss.charAt(i) == 'y') {
                resultY++;
            }
        }
        if(resultP != resultY) {
            answer = false;
        }

        return answer;
    }
}
