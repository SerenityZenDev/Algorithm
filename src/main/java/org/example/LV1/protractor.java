package org.example.LV1;

public class protractor {
    public int solution(int angle) {
        if  (angle > 0 && angle < 90) return 1;
        else if(angle == 90) return 2;
        else if(angle > 90 && angle < 180) return 3;
        else if(angle == 180) return 4;
        else return 0;
    }

    public static void main(String[] args) {
        protractor protractor = new protractor();
        System.out.println(protractor.solution(0));
        System.out.println(protractor.solution(45));
        System.out.println(protractor.solution(90));
        System.out.println(protractor.solution(135));
        System.out.println(protractor.solution(180));
    }
}
