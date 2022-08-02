package com.deep.offer.整数01;

import java.util.Stack;

/**
 * 二进制加法：
 * 考察点：位移运算、与或非
 * <p>
 * 题目：输入两个表示二进制的字符串，请计算它们的和，并以二进制字符串的形式输出。
 * 例如，输入的二进制字符串分别是"11"和"10"，则输出"101"。
 *
 * @author: Deep
 * @create: 2022-08-01
 */
public class Offer002_二进制加法 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "10"));
    }

    /**
     * 从后往前一次相加每一位，找一个标志控制进位
     *
     * @param a a
     * @param b b
     * @return 相加结果
     */
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;   // 进位标志
        while (i >= 0 || j >= 0) {
            int digitA = i >= 0 ? a.charAt(i--) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = digitA + digitB + flag;
            flag = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            result.append(sum);
        }
        // 进位
        if (flag == 1) {
            result.append(1);
        }

        return result.reverse().toString();
    }
}
