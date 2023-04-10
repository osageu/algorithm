package programmers.level1;

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for(int i = 0 ; i < s.length() ; i++) {
            String split_word = s.substring(0, i);
            String myturn_string = String.valueOf(s.charAt(i));
            int index = split_word.lastIndexOf(myturn_string);
            if(index > -1) {
                answer[i] = split_word.length() - index;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
