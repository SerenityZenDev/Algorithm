package org.example.baekjoon.stepbystep.LV8_일반_수학1;

import java.util.Scanner;

public class N6_1193 {

    /*

    1/1	1/2	1/3	1/4	1/5	…    1  2  6  7  15
    2/1	2/2	2/3	2/4	…	…    3  5  8  14
    3/1	3/2	3/3	…	…	…    4  9  13
    4/1	4/2	…	…	…	…    10 12
    5/1	…	…	…	…	…    11
    …	…	…	…	…	…

    1 : 1/1
    2 : 1/2
    3 : 2/1
    4 : 3/1
    5 : 2/2
    6 : 1/3
    7 : 1/4
    8 : 2/3

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();

        int squareCount = 1;
        int squareSum = 0;

        while (true) {
            if (X <= squareCount + squareSum) {
                if (squareCount % 2 == 1) {
                    System.out.println(squareCount - (X - squareSum - 1) + "/" + (X - squareSum));
                    break;
                } else {
                    System.out.println((X - squareSum) + "/" + (squareCount - (X - squareSum - 1)));
                    break;
                }
            } else {
                squareSum += squareCount;
                squareCount++;
            }
        }
    }
}
