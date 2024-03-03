package org.example.sparta.LV2;

public class Greatest_common_divisor_and_least_common_multiple {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        // 최대공약수 구하기
        int gcd = getGCD(n, m);

        // 최소공배수 구하기
        int lcm = (n * m) / gcd;

        // 결과 배열에 값 할당
        answer[0] = gcd;
        answer[1] = lcm;

        return answer;
    }

    // 최대공약수를 구하는 메소드
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        // 예시 테스트 케이스
        int[] result1 = solution(3, 12);
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");

        int[] result2 = solution(2, 5);
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");

    }
}
