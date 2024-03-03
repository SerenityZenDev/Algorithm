package org.example.sparta.LV4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Personal_information_collection_validity_period {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();

        for (String term : terms) {
            map.put(term.split(" ")[0], term.split(" ")[1]);
        }

        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        for (int i=0; i< privacies.length; i++){
            String date = privacies[i].split(" ")[0];
            int type = Integer.parseInt(map.get(privacies[i].split(" ")[1]))*28;

            int num =
                (year - Integer.parseInt(date.split("\\.")[0])) * 28 * 12 +
                (month - Integer.parseInt(date.split("\\.")[1])) * 28 +
                (day - Integer.parseInt(date.split("\\.")[2]));

            if (num >= type) list.add(i+1);
        }



        return list.stream().filter(Objects::nonNull).mapToInt(i -> i).toArray();
    }
}
