package org.example.LV2;

public class Ternary_reversal {
    public static int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }

    /*
    // 왜 안되는지 확인하기
    public long solution(long n) {
//         long[] answer;

//         int count = 0;
//         long countN = n;

//         while (countN >= 3) {
//             countN /= 3;
//             count++;
//         }

//         answer = new long[count + 1];

//         for (int i = 0; i < answer.length; i++) {
//             if (n > 3) {
//                 answer[i] = n % 3;
//                 n /= 3;
//             } else {
//                 answer[i] = n;
//             }
//         }

//         long result = 0;
//         long power = 1;

//         for (int j = answer.length - 1; j >= 0; j--) {
//             result += answer[j] * power;
//             power *= 3;
//         }

//         return result;
//     }
     */

    public static void main(String[] args) {
        System.out.println(solution(45));
    }
}
