package org.example.LV2;

public class Find_Kim_Seobang_in_Seoul {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                answer = "김서방은 " + i + "에 있다";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        Find_Kim_Seobang_in_Seoul solution = new Find_Kim_Seobang_in_Seoul();
        System.out.println(solution.solution(seoul));
    }
}
