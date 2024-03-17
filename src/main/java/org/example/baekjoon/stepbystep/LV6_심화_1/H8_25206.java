package org.example.baekjoon.stepbystep.LV6_심화_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class H8_25206 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalGrade = 0.0;
        double totalScore = 0.0;

        while(true){
            String line = br.readLine();
            if(Objects.equals(line, "") || line == null) break;


            if(line.split(" ")[2].equals("P")) continue;

            double grade = Double.parseDouble(line.split(" ")[1]);
            double score = getScore(line.split(" ")[2]);

            totalGrade += grade;
            totalScore += score * grade;

        }
        if(totalScore == 0.0 || totalGrade == 0.0){
            System.out.println(0.0);
        } else {
            System.out.println(totalScore / totalGrade);
        }
    }

    private static Double getScore(String s) {
        switch (s) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            default: return 0.0;
        }
    }

}
