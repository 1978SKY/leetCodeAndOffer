package com.deep.labuladong.二分;

/**
 * @author Deep
 * @create 2022-08-18
 */
public class LeetCode793 {
    public static void main(String[] args) {
        System.out.println(preimageSizeFZF(0));
    }

    public static int preimageSizeFZF(int k) {
        String sK = String.valueOf(k);

        int i = 0, res = 0;
        while (true) {
            int num = f(i);
            if (num <= 0) {
                break;
            } else {
                String sNum = String.valueOf(num);
                if (f1(sK, sNum)) {
                    res++;
                    System.out.println(sNum);
                }
                i++;
            }
        }
        return res;
    }

    private static boolean f1(String sK, String sNum) {
        int i = sK.length() - 1;
        int j = sNum.length() - 1;

        while (i >= 0 && j >= 0) {
            if (sK.charAt(i) != sNum.charAt(j)) {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }

    private static int f(int num) {
        if (num == 0) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }


}
