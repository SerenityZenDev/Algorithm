package org.example.sparta.LV4;

import java.util.Arrays;

public class Walk_in_the_park {
    public static int[] solution(String[] park, String[] routes) {

        int[] start = new int[2];

        for (int i=0; i< park.length; i++){
            for (int j=0; j<park[i].length(); j++){
                if (park[i].charAt(j) == 'S'){
                    start[0] = i;
                    start[1] = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            String direction = route.split(" ")[0];
            int distance = Integer.parseInt(route.split(" ")[1]);
            switch (direction){
                case "N" -> {
                    for (int i=0; i<distance; i++){
                        if ((start[0]-1) < 0 || park[start[0]-1].charAt(start[1]) == 'X') break;
                        else start[0]--;
                    }
                }
                case "S" -> {
                    for (int i=0; i<distance; i++){
                        if ((start[0]+1) >= park.length || park[start[0]+1].charAt(start[1]) == 'X') break;
                        else start[0]++;
                    }
                }
                case "W" -> {
                    for (int i=0; i<distance; i++){
                        if ((start[1]-1) < 0 || park[start[0]].charAt(start[1]-1) == 'X') break;
                        else start[1]--;
                    }
                }
                case "E" -> {
                    for (int i=0; i<distance; i++){
                        if ((start[1]+1) >= park[start[0]].length() || park[start[0]].charAt(start[1]+1) == 'X') break;
                        else start[1]++;
                    }
                }
            }
        }

        return start;
    }

    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};
        System.out.println(Arrays.toString(solution(park, routes))); // [0,0]이 나와야 합니다.
    }
}

/*
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int parkH =park.length;
        int parkW =park[0].length();
        int robotH =0;
        int robotW =0;

        String[][] parkCo = new String[parkH][parkW];
        for(int i=0; i<parkH;i++){
            String[] parkap = park[i].split("");
            for(int j=0; j<parkW;j++){
                parkCo[i][j]=parkap[j];
            }
        }
        for(int i=0;i<parkH;i++){
            for(int j=0;j<parkW;j++){
                if(parkCo[i][j].equals("S")){
                    robotH=i;
                    robotW=j;
                    break;
                }
            }
        }
        for(int i=0; i<routes.length;i++){
            String[] spl = routes[i].split(" ");
            int time = Integer.parseInt(spl[1]);//반복횟수는 time으로
            boolean go = true;
            switch(spl[0]){
                case "N"://H줄이기
                    if(robotH-time<0){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH-n][robotW].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotH-=time;
                    break;
                case "S"://H늘리기
                    if(robotH+time>=parkH){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH+n][robotW].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotH+=time;
                    break;
                case "W"://W줄이기
                    if(robotW-time<0){break;}
                     for(int n=1;n<=time;n++){
                        if(parkCo[robotH][robotW-n].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotW-=time;
                    break;
                case "E"://W늘리기
                    if(robotW+time>=parkW){break;}
                    for(int n=1;n<=time;n++){
                        if(parkCo[robotH][robotW+n].equals("X")){go = false;}
                    }
                    if(go==false){break;}
                    robotW+=time;
                    break;
            }
        }
        int[] answer = new int[2];
        answer[0] = robotH;
        answer[1] = robotW;
        return answer;
    }
}

 */