package programmers.level2;

public class 문자열_압축 {
    public int solution(String s) {
        int answer = s.length();

        for(int i = 1 ; i < s.length() / 2 + 1 ; i++) {

            String target = s.substring(0, i); // "a"
            int count = 1;
            String compar = "";
            StringBuilder sb = new StringBuilder();
            for(int j = i ; j < s.length() ; j+=i) {
                if(j+i >= s.length()) {
                    compar = s.substring(j, s.length());
                }else{
                    compar = s.substring(j, j+i);
                }
                if(target.equals(compar)) {
                    count++;
                } else {
                    if(count > 1) {
                        sb.append(count + target);
                    } else {
                        sb.append(target);
                    }
                    target = compar;
                    count = 1;
                }
                if(j+i >= s.length()) {
                    if(count != 1) {
                        sb.append(count + target);
                    }else{
                        sb.append(target);
                    }
                }
            }
            answer = Math.min(sb.toString().length(), answer);

        }


        return answer;
    }
}
