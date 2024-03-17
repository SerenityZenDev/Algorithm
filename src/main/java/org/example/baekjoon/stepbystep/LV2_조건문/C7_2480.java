package org.example.baekjoon.stepbystep.LV2_조건문;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

public class C7_2480 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();

        String line = scanner.nextLine();
        for (int i = 0; i < line.split(" ").length; i++) {
            map.put(Integer.parseInt(line.split(" ")[i]),
                map.getOrDefault(Integer.parseInt(line.split(" ")[i]), 0) + 1);
        }

        if (map.size() == 1) {
            System.out.println(10000 + map.keySet().iterator().next() * 1000);
        } else if (map.size() == 2) {
            Optional<Entry<Integer, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
            System.out.println(1000 + maxEntry.get().getKey() * 100);
        } else {
            Optional<Integer> maxKey = map.keySet()
                .stream()
                .max(Comparator.naturalOrder());
            System.out.println(100 * maxKey.get());
        }


    }
}
