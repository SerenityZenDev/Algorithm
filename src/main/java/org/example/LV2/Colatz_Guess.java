package org.example.LV2;

public class Colatz_Guess {
    public int solution(long num) {
        int answer = -1;
        int count = 0;
        while (count < 500) {
            if (num == 1) {
                answer = count;
                break;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            count++;
        }

        if (answer == -1) {
            return -1; // 500번의 반복 후에도 1이 되지 않았을 경우
        } else {
            return answer; // 정상적으로 1이 되었을 경우
        }
    }

    public static void main(String[] args) {
        Colatz_Guess solution = new Colatz_Guess();
        System.out.println(solution.solution(626331));
    }
}
