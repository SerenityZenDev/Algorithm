package org.example.LV4;

import java.util.ArrayList;
import java.util.List;

public class Making_hamburgers {
    public static int solution(int[] ingredient) {
        int answer = 0;
        List<Integer> li = new ArrayList<>();

        for(int i :ingredient) {
            li.add(i);
            while(li.size() >= 4) {
                int n = li.size();
                if(!(li.get(n-1) == 1
                    && li.get(n-2)==3
                    && li.get(n-3) ==2
                    && li.get(n-4)==1)) break;
                for(int j=0; j<4; j++) {
                    li.remove(li.size() -1);
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int []i = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        solution(i);
        System.out.println(solution(i));
    }

}
