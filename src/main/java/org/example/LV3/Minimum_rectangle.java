package org.example.LV3;

public class Minimum_rectangle {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] maxSize = new int[sizes.length];
        int[] minSize = new int[sizes.length];
        for (int i=0; i< sizes.length; i++){
            if (sizes[i][0] >= sizes[i][1]){
                maxSize[i] = sizes[i][0];
                minSize[i] = sizes[i][1];
            } else {
                maxSize[i] = sizes[i][1];
                minSize[i] = sizes[i][0];
            }
        }
        int maxSizeMax = 0;
        int minSizeMax = 0;

        for (int i=0; i<sizes.length; i++){
            if (maxSize[i] > maxSizeMax) maxSizeMax = maxSize[i];
            if (minSize[i] > minSizeMax) minSizeMax = minSize[i];
        }
        answer = maxSizeMax * minSizeMax;
        return answer;
    }

}
