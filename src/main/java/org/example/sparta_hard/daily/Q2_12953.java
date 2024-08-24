package org.example.sparta_hard.daily;

public class Q2_12953 {
    /*
    최대 공약수(GCD) 의 예시
    ex) : gcd(24, 14)
    a = 24
    b = 14
    return (14, (24 % 14) = 10) -> return (14,10)
    ...
    24 14
    14 10
    10 4
    4 2
    2 0
    2
     */

    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        return answer;
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
