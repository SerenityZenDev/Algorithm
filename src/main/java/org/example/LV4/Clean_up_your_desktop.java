package org.example.LV4;


public class Clean_up_your_desktop {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[]{50, 50, 0, 0};

        int row = wallpaper.length;
        int col = wallpaper[0].length();

        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if (wallpaper[i].charAt(j) == '#'){
                    answer[0] = Math.min(answer[0], i);
                    answer[1] = Math.min(answer[1], j);
                    answer[2] = Math.max(answer[2], i+1);
                    answer[3] = Math.max(answer[3], j+1);
                }
            }
        }

        return answer;
    }
}
