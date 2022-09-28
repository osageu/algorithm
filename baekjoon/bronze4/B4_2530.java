package baekjoon.bronze4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class B4_2530 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        String time = sc.nextInt() + ":" + sc.nextInt() +  ":" + sc.nextInt();
        Date date = sdf.parse(time);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, sc.nextInt());

        String[] array_split = sdf.format(cal.getTime()).split(":");
        System.out.println(
            Integer.parseInt(array_split[0]) + " " +
            Integer.parseInt(array_split[1]) + " " +
            Integer.parseInt(array_split[2])
        );
    }
}
