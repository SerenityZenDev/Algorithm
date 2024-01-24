package org.example.LV3;

public class Food_fight_competition {
    public static String solution(int[] food) {
        String answer = "";
        int size = food.length;

        for (int i=1; i<size; i++){
            for (int j=0; j<food[i]/2; j++){
                answer += i;
            }
        }

        answer += "0";

        for (int i=size-1; i>0; i--){
            for (int j=0; j<food[i]/2; j++){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        solution(food);
    }
}
