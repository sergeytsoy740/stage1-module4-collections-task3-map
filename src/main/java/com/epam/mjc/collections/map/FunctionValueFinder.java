package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>(List.of(2, -6, 10, 19, 55, 11));
        int requiredValue = 52;

        isFunctionValuePresent(source, requiredValue);
    }


    public static boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
//        boolean isThere = functionMap.containsValue(requiredValue);
//        System.out.println(isThere);
//        return isThere;
        return functionMap.containsValue(requiredValue);
    }

    private static Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedFunctionMap = new HashMap<>();
        for (int e : sourceList) {
            calculatedFunctionMap.put(e, 5 * e + 2);
        }
        System.out.println(calculatedFunctionMap);
        return calculatedFunctionMap;
    }
}
