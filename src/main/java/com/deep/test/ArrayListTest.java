package com.deep.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create: 2022-09-01
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(getSubList(0, 3, list));

        System.out.println(getSubList(8, 3, list));

        System.out.println(getSubList(5, 0, list));


    }


    private static  <T> List<T> getSubList(int start, int limit, List<T> list) {
        if (start < 0 || limit < 0) {
            throw new IllegalArgumentException("非法参数：start或limit不能为负数！");
        }
        if (start > list.size()) {
            return new ArrayList<>();
        }
        if (start + limit > list.size()) {
            return list.subList(start, list.size());
        }
        return list.subList(start, start + limit);
    }
}
