package org.example.sparta.LV2;

public class Find_the_average {
    public double solution(int[] arr) {
        double answer = 0;
        int length = arr.length;
        for(int i=0; i<length; i++){
            answer += arr[i];
        }
        answer /= length;
        return answer;
    }

    public static void main(String[] args) {
        Find_the_average solution = new Find_the_average();
        int arr[] = {1,2,3,4,5,6};
        System.out.println(solution.solution(arr));
    }
}
