package org.example.LV2;

public class Hide_your_cell_phone_number {
    public String solution(String phone_number) {
        String answer = "";

        StringBuilder builder = new StringBuilder(phone_number);
        int replaceLength = phone_number.length()-4;
        String star = "*".repeat(replaceLength);

        answer = builder.replace(0,replaceLength,star).toString();

        return answer;
    }

    public static void main(String[] args) {
        Hide_your_cell_phone_number solution = new Hide_your_cell_phone_number();
        System.out.println(solution.solution("01033334444"));
    }
}
