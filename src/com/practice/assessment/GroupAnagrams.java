package com.practice.assessment;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {

    public static void groupAnagrams(String[] words)
    {

        List<String> list = Arrays.stream(words)
                .map(s -> Stream.of(s.split("")).sorted()
                        .collect(Collectors.joining()))
                .collect(Collectors.toList());

        Map<String, List<Integer>> multiMap = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            multiMap.putIfAbsent(list.get(i), new ArrayList<>());
            multiMap.get(list.get(i)).add(i);
        }

        for (String key: multiMap.keySet()) {
            System.out.println(multiMap.get(key).stream()
                    .map(i -> words[i])
                    .collect(Collectors.toList()));
        }
    }
}
