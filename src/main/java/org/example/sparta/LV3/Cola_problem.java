package org.example.sparta.LV3;

public class Cola_problem {
    public static int solution(int a, int b, int n) {
        int answer = getCola(a,b,n);
        return answer;
    }

    public static int getCola(int a, int b, int n){
        int cola = 0;
        while(true){
            if (n < a) break;
            else {
                int exchangedCola = n / a * b;
                cola += exchangedCola;
                n = exchangedCola + n % a;
            }
        }
        return cola;
    }
}
