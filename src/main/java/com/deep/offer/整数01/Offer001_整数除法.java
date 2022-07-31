package com.deep.offer.整数01;

/**
 * 整数除法：
 * 考察点：整数溢出问题。
 * <p>
 * 题目：输入2个int型整数，它们进行除法计算并返回商，要求不得使用乘号'*'、除号'/'及求余符号'%'。
 * 当发生溢出时，返回最大的整数值。假设除数不为0。例如，输入15和2，输出15/2的结果，即7。
 *
 * @author: Deep
 * @create: 2022-07-31
 */
public class Offer001_整数除法 {
    public static void main(String[] args) {
        System.out.println(divide1(-2147483648, -1));
    }

    /**
     * 试想：将传入的类型转换为更大的类型，例如将int转换为long类型。<br>
     * 问题：如果为double类型该怎么转换？更重要的是不能用*和/符号。
     */
    public static int divide(int a, int b) {
/*        if (b == 0) {
            return -1;
        }*/
        long res = (long) a / (long) b;
        // 防止转正数时发生越界（负数不会）
        if (Integer.MAX_VALUE < res) {
            res = Integer.MAX_VALUE;
        }
        return (int) res;
    }

    /**
     * 解法一：循环去减，将两数都转换为负数，然后循环作差，作差次数即为相除结果。<br>
     * 注意点：1、记录两数相除结果的正负    2、避免多减
     */
    public static int divide1(int a, int b) {
        // 防止上溢
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        }
        // 记录两数相除后的正负
        boolean flag = a < 0 == b < 0;

        // 转换为负数，避免越界
        a = a < 0 ? a : -a;
        b = b < 0 ? b : -b;
        int res = 0;
        while (a < 0) {
            a -= b;
            res--;
        }
        // 避免多减（舍位）因为a、b本身都是负数，多减之后将会变成正数
        if (a > 0) {
            res++;
        }
        return !flag ? res : -res;
    }
}
