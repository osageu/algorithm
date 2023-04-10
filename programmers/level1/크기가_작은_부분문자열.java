package programmers.level1;

public class 크기가_작은_부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        long p_int = Long.parseLong(p);

        for(int i = 0 ; i < t.length() - p.length() + 1 ; i++) {
            String cut_string = t.substring(i, i + p.length());
            if(Long.parseLong(cut_string) <= p_int) {
                answer++;
            }
        }

        return answer;
    }
}
