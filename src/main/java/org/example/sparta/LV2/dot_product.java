package org.example.sparta.LV2;

public class dot_product {
    public static int solution(int[] a, int[] b) {
        int answer = 0;

        int length = a.length;

        for(int i=0; i<length; i++){
            answer += a[i]*b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        int[] c = {-1,0,1};
        int[] d = {1,0,-1};
        System.out.println(solution(a,b));
        System.out.println(solution(c,d));
    }

}
