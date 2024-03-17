package org.example.baekjoon.stepbystep.LV2_조건문;

import java.util.Scanner;

public class C5_2884 {

    static final int ALARM_BEFORE = 45;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.nextLine();

        int hour = Integer.parseInt(time.split(" ")[0]);
        int minute = Integer.parseInt(time.split(" ")[1]);

        minute -= ALARM_BEFORE;

        if (minute < 0){
            hour -= 1;
            minute += 60;
        }

        if (hour < 0){
            hour += 24;
        }

        System.out.println(hour + " " + minute);

    }
}
