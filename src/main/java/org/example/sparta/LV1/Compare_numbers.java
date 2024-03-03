package org.example.sparta.LV1;

public class Compare_numbers {
    public static int solution(int num1, int num2) {

        if(num1 == num2){
            return 1;
        }else{
            return -1;
        }

    }
    public static void main(String[] args) {
        System.out.println(solution(10,10));
        System.out.println(solution(10,20));
    }
}
