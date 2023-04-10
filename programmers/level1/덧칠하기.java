package programmers.level1;

public class 덧칠하기 {
    int answer = 0;

    public int solution(int n, int m, int[] section) {
        int[] section_array = new int[n];
        for(int i = 0 ; i < section.length ; i++) {
            section_array[section[i]-1] = 1;
        }

        paint(section_array, m);

        return answer;
    }

    private void paint(int[] section_array, int roller) {
        boolean stop_loop = false;
        for(int i = 0 ; i < section_array.length ; i++) {
            if(section_array[i] == 1) {
                for(int j = i ; j < i + roller ; j++) {
                    if(j < section_array.length) {
                        section_array[j] = 0;
                    }
                }
                stop_loop = true;
                answer++;
                break;
            }
        }

        if(stop_loop) {
            paint(section_array, roller);
        }
    }
}
