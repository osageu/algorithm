package baekjoon.bronze5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class B5_16170 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date now = new Date();
        String today = sdf.format(now);
        String[] array_split = today.split("-");
        for(String index : array_split) {
            System.out.println(index);
        }
    }
}
