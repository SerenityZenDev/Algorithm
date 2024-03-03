package org.example.sparta.LV2;

public class array_of_numbers_that_fall_apart {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 원소 개수 세기
        int count = 0;
        for (int num : arr) {
            if (num % divisor == 0) {
                count++;
            }
        }

        // 나누어 떨어지는 원소가 하나도 없으면 -1을 담은 배열 반환
        if (count == 0) {
            return new int[]{-1};
        }

        // 나누어 떨어지는 원소를 담을 배열 선언
        int[] resultArray = new int[count];
        int index = 0;

        // 나누어 떨어지는 원소를 배열에 저장
        for (int num : arr) {
            if (num % divisor == 0) {
                resultArray[index++] = num;
            }
        }

        // 버블 정렬을 사용하여 정렬
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    // 두 원소의 위치를 교환
                    int temp = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = temp;
                }
            }
        }

        return resultArray;
    }


    public static void main(String[] args) {
        array_of_numbers_that_fall_apart solution = new array_of_numbers_that_fall_apart();

        int arr1[] = {5,9,7,10};
        int arr2[] = {2,36,1,3};
        int arr3[] = {3,2,6};

        System.out.println(solution.solution(arr1, 5));
        System.out.println(solution.solution(arr2, 1));
        System.out.println(solution.solution(arr3, 10));
    }
}
