package programmers.level1;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        // 1. 0 존재 유무
        int count0 = 0;
        for(int index : lottos) {
            if(index == 0) {
                count0++;
            }
        }

        // 2. 반복문 통해서 비교
        int count = 7;
        for(int index1 : lottos) {
            for(int index2 : win_nums) {
                if(index1 == index2) {
                    count--;
                    break;
                }
            }
        }

        if(count == 7) {
            count--;
        }
        answer[1] = count;

        if(count-count0 == 0) {
            answer[0] = 1;
        }else{
            answer[0] = count-count0;
        }

        return answer;
    }
}
