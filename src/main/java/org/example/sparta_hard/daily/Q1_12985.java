package org.example.sparta_hard.daily;

public class Q1_12985 {

    /*
    case 1)
    총 8명 (N)
    A = 4
    B = 7

3)          A            B
2)      1      A      5      B
1)    1  2 | 3  A | 5  6 | B  8
return 3
     */
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
            if (a == b) {
                break;
            }
        }

        return answer;
    }
}
