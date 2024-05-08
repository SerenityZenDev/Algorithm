package org.example.baekjoon.stepbystep.LV10_기하_직사각형과_삼격형;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q7_5073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();

            int a = Integer.parseInt(line.split(" ")[0]);
            int b = Integer.parseInt(line.split(" ")[1]);
            int c = Integer.parseInt(line.split(" ")[2]);

            int sum = a + b + c;
            int max = Math.max(Math.max(a, b), Math.max(b, c));

            if (max == 0){
                break;
            } else if ((sum - max) <= max) {
                System.out.println("Invalid");
            } else if (a == b && b == c){
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }

        }
    }

}
