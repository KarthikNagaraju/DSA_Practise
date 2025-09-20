package org.learning.Strings;

import java.util.*;
import java.util.stream.Collectors;

public class SortCharacters {

    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }


       /* List<Map.Entry<Character, Integer>> list =
                map.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).
                        toList();*/

        PriorityQueue<Map.Entry<Character, Integer>> pq =
                new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        pq.addAll(map.entrySet());

        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> temp = pq.poll();
            str.append(String.valueOf(temp.getKey()).repeat(temp.getValue()));
        }

    /*    for (Map.Entry<Character, Integer> temp : pq) {

            str.append(String.valueOf(temp.getKey()).repeat(Math.max(0, temp.getValue())));

        }*/


        return new String(str);
    }
}
