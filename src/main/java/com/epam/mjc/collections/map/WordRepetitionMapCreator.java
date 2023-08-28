package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {

    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        String[] words = sentence.toLowerCase().replaceAll("[-.?!)(,:]", "").split("\\s");
        Map<String, Integer> repetitions;
        if (sentence.equals("")) {
            repetitions = new HashMap<>();
        } else {
            repetitions = new HashMap<>();
            for (String e : words) {
                Integer quantity = repetitions.get(e);
                if (quantity == null) {
                    quantity = 0;
                }
                repetitions.put(e, ++quantity);
            }
        }
        return repetitions;
    }
}
