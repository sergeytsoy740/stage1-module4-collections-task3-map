package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public static void main(String[] args) {
        Map<Integer, String> source = new HashMap<>(Map.of(
                1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday",
                10, "Friday"));

        swap(source);
    }

    public static Map<String, Integer> swap(Map<Integer, String> sourceMap) {

        Map<String, Integer> swapedSourceMap = new HashMap<>();

        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());

            boolean isThereKey = swapedSourceMap.containsKey(entry.getValue());

            if (!isThereKey) {
                swapedSourceMap.put(entry.getValue(), entry.getKey());
            } else {
                if (swapedSourceMap.get(entry.getValue()) > entry.getKey()) {
                    swapedSourceMap.put(entry.getValue(), entry.getKey());
                }
            }
        }
//        System.out.println(swapedSourceMap);
        return swapedSourceMap;
    }
}
