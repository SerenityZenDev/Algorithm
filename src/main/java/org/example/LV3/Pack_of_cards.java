package org.example.LV3;

public class Pack_of_cards {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";

        int cards1S = cards1.length;
        int cards2S = cards2.length;

        int cards1I = 0;
        int cards2I = 0;


        for(int i=0; i< goal.length; i++){
            if (cards1I < cards1S  && cards1[cards1I].equals(goal[i])) cards1I++;
            else if (cards2I < cards2S  && cards2[cards2I].equals(goal[i])) cards2I++;
            else{
                answer = "No";
                break;
            }
        }
            return answer;
    }

    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1,cards2,goal));
    }
}
