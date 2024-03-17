package org.example.baekjoon.stepbystep.LV2_조건문;

import java.util.Scanner;

public class C6_2525 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time = in.nextLine();
        int cookTime = in.nextInt();

        int hour = Integer.parseInt(time.split(" ")[0]);
        int minute = Integer.parseInt(time.split(" ")[1]);

        minute += cookTime;

        int overTime = minute / 60;

        if (overTime > 0){
            minute -= 60 * overTime;
            hour += overTime;
        }

        if(hour > 23) hour -= 24;

        System.out.println(hour + " " + minute);

    }
}
