package org.example.baekjoon.stepbystep.loop;

import java.util.Scanner;

public class L12_10951 {

    //    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        String str;
//
//        while(!Objects.equals(str = br.readLine(), "")){
//
//            st = new StringTokenizer(str," ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(a+b).append("\n");
//
//        }
//        System.out.print(sb);
//    }
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {

            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);

        }
        in.close();
    }
}
