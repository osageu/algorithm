package programmers.level1;

public class 대충_만든_자판 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphabet = new int[26];
        for(int i = 0 ; i < alphabet.length ; i++) {
            alphabet[i] = 9999;
        }

        for(int i = 0 ; i < keymap.length ; i++) {
            String keymap_index = keymap[i];
            for(int j = 0 ; j < keymap_index.length() ; j++) {
                char keymap_index_char = keymap_index.charAt(j);
                alphabet[keymap_index_char-65] = Math.min(alphabet[keymap_index_char-65], j+1);
            }
        }

        for(int i = 0 ; i < targets.length ; i++) {
            String targets_index = targets[i];
            int count = 0;
            for(int j = 0 ; j < targets_index.length() ; j++) {
                char targets_index_char = targets_index.charAt(j);
                if(alphabet[targets_index_char-65] != 9999) {
                    count += alphabet[targets_index_char-65];
                } else {
                    count = -1;
                    break;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}
