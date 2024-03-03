package org.example.sparta.LV2;

public class Remove_smallest_number {
    public static int[] solution(int[] arr) {
        if(arr.length < 2){
            return new int[] {-1};
        }


        int minIndex = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[minIndex] > arr[i]){
                minIndex = i;
            }
        }

        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, minIndex);
        System.arraycopy(arr, minIndex + 1, result, minIndex, arr.length - minIndex - 1);


        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] result = solution(arr);

        for (int a : result){
            System.out.print(a + " ");
        }
    }
}
