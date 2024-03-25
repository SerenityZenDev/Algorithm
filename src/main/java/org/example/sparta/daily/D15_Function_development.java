package org.example.sparta.daily;


import java.util.ArrayList;
import java.util.List;

public class D15_Function_development {


    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] works = new int[progresses.length];
        List<Integer> workList = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int leftProgress = 100 - progresses[i];
            works[i] = leftProgress / speeds[i];

            if (leftProgress % speeds[i] != 0) {
                works[i] += 1;
            }
        }

        for (int i = 1; i < works.length; i++) {
            if (works[i] < works[i - 1]) {
                works[i] = works[i - 1];
            }
        }

        int base = works[0];
        int count = 1;
        for (int i = 1; i < works.length; i++) {
            if (base >= works[i]) {
                count++;
            } else {
                workList.add(count);
                base = works[i];
                count = 1;
            }
        }
        workList.add(count);

        answer = new int[workList.size()];

        for (int i = 0; i < workList.size(); i++) {
            answer[i] = workList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        D15_Function_development d = new D15_Function_development();
        System.out.println(d.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }
}
