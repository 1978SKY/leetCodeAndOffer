package com.deep.test;

import java.util.Arrays;
import java.util.Date;

/**
 * @author Deep
 * @create: 2022-09-02
 */
public class DateTest {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for(int i=0;i<10;i++){
            nums[i] = 9-i;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Date date = new Date(1461575957000L);
        System.out.println(date);
    }
}
