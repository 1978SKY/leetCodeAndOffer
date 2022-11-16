package com.deep.labuladong.滑动窗口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 找到所有字符串中所有字母异位词
 *
 * @author Deep
 * @create: 2022-08-23
 */
public class LeetCOde438 {
    public List<Integer> findAnagrams(String s, String p) {
        int pLen = p.length();
        if (s.length() < pLen) {
            return new ArrayList<Integer>();
        }
        // 辅助数组记录p的字符分步情况
        int[] ints = new int[128];
        for (int i = 0; i < pLen; i++) {
            ints[p.charAt(i) - ' ']++;
        }

        List<Integer> res = new ArrayList<>();
        // 窗口遍历
        for (int i = 0; i <= s.length() - pLen; i++) {
            // 判断窗口内部的数据是否符合题意
            int[] intsBak = ints.clone();
            String sub = s.substring(i, i + pLen);
            for (int j = 0; j < pLen; j++) {
                intsBak[sub.charAt(j) - ' ']--;
            }
            boolean match = Arrays.stream(intsBak).allMatch(item -> item == 0);
            if (match) {
                res.add(i);
            }
        }
        return res;
    }
}
