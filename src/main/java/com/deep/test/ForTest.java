package com.deep.test;

import java.util.ArrayList;
import java.util.List;

/**
 * For循环测试
 *
 * @author Deep
 * @create: 2022-08-25
 */
public class ForTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
