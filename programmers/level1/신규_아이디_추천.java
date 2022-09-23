package programmers.level1;

public class 신규_아이디_추천 {
    public String solution(String new_id) {
        String answer = "";

        // step.1
        answer = new_id.toLowerCase();

        // step.2
        answer = answer.replaceAll("[^\\w\\_\\-\\.]","");

        // step.3
        answer = answer.replaceAll("\\.{2,}",".");

        // step.4
        answer = answer.replaceAll("^[.]|[.]$","");

        // step.5
        if(answer.equals("")) {
            answer = "a";
        }

        // step.6 & 7
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
            answer = answer.replaceAll("[.]$","");
        } else if (answer.length() <= 2) {
            while(answer.length() < 3) {
                answer += answer.charAt(answer.length()-1);
            }
        }

        return answer;
    }
}
