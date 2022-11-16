package com.deep.labuladong.滑动窗口;

/**
 * 无重复字符的最长子串
 *
 * @author Deep
 * @create: 2022-08-22
 */
public class LeetCode3 {
    private String s;
    private Integer length;

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 0) {
            return 0;
        }
        this.s = s;
        this.length = length;
        // 符合题意的子串最长大小
        int maxSubLen = 1;
        for (int i = 1; i <= length; i++) {
            if (help(i)) {
                maxSubLen = i;
            } else {
                return maxSubLen;
            }
        }
        return maxSubLen;
    }

    /**
     * 帮助方法
     *
     * @param winNum 窗口大小
     * @return true:存在符合窗口大小的子串
     */
    private boolean help(int winNum) {
        // 滑动窗口
        for (int i = winNum; i <= length; i++) {
            // 提取子串（其实也可以不用提取）
            String sub = s.substring(i - winNum, i);
            // 辅助数组，用来判断子串是否有重复数据
            int[] ints = new int[128];

            int j;
            for (j = 0; j < winNum; j++) {
                ints[sub.charAt(j) - ' ']++;
                if (ints[sub.charAt(j) - ' '] > 1) {
                    break;
                }
            }
            if (j >= sub.length()) {
                return true;
            }
        }
        return false;
    }
}
