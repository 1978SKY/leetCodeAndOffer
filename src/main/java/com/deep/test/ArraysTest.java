package com.deep.test;

import java.util.Arrays;

/**
 * 数组排序
 *
 * @author Deep
 * @create: 2022-08-30
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 4, 5};
        Arrays.sort(nums);
        Arrays.parallelSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
