package com.deep.treeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author: Deep
 * @create: 2022-08-09
 */

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Object, Object> treeMap = new TreeMap<>(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return Integer.compare(o1.hashCode(), o2.hashCode());
            }
        });
        Integer integer = 1;
        treeMap.put(integer, "integer1");
        treeMap.put(129, "integer129");

        treeMap.put(2, "integer2");

        treeMap.forEach((key, value) -> System.out.println(value));

    }
}
