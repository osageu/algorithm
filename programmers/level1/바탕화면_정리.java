package programmers.level1;

public class 바탕화면_정리 {
    public int[] solution(String[] wallpaper) {
        boolean top_found = false;
        int top = 0;
        int left = 100;
        int bottom = 0;
        int right = 0;
        for(int i = 0 ; i < wallpaper.length ; i++) {
            String wallpaper_index = wallpaper[i];
            if(wallpaper_index.contains("#") && !top_found) {
                top = i;
                top_found = true;
            }
            int sharp_left_position = wallpaper_index.indexOf("#");
            int sharp_right_position = wallpaper_index.lastIndexOf("#");
            if(sharp_left_position >= 0 && sharp_right_position >= 0) {
                left = Math.min(left, sharp_left_position);
                right = Math.max(right, sharp_right_position + 1);
            }
        }
        for(int i = wallpaper.length - 1 ; i >= 0 ; i--) {
            String wallpaper_index = wallpaper[i];
            if(wallpaper_index.contains("#")) {
                bottom = i+1;
                break;
            }
        }

        int[] answer = {top, left, bottom, right};
        return answer;
    }
}
