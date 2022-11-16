package com.deep.labuladong.二分;

/**
 * 在 D 天内送达包裹的能⼒
 * <p>
 * 标签：⼆分搜索
 * 传送带上的第 i 个包裹的重量为 weights[i]，运输船每天都会来运输这些包裹，
 * 每天装载的包裹重量之和 不能超过船的最⼤运载重量。
 * 如果要在 D 天内将所有包裹运输完毕，求运输船的最低运载能⼒。
 * 示例 1：输⼊：weights = [1,2,3,4,5,6,7,8,9,10], D = 5
 * 输出：15
 * 解释：
 * 船舶最低载重 15 就能够在 5 天内送达所有包裹，如下所示： 第 1 天：1, 2, 3, 4, 5
 * 第 2 天：6, 7
 * 第 3 天：8 第 4 天：9 第 5 天：10
 * 请注意，货物必须按照给定的顺序装运，因此使⽤载重能⼒为 14 的船舶并将包装分成 (2, 3, 4,
 * 5), (1, 6, 7), (8), (9), (10) 是不允许的。
 *
 * @author: Deep
 * @create: 2022-08-11
 */
public class Leetcode1011 {

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Leetcode1011 leetCode = new Leetcode1011();
        int result = leetCode.shipWithinDays(weights, 5);

        System.out.println(result);
    }

    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 1;
        for (int weight : weights) {
            l = Math.max(l, weight);
            r += weight;
        }

        while (l < r) {
            int mid = l + (r - l) / 2;
            if (judge(weights, mid) <= days) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    /**
     * 辅助函数，在x的载重量下，装在完成需要的天数
     *
     * @param weights 货物
     * @param x       装载量
     * @return 天数
     */
    private int judge(int[] weights, int x) {
        int days = 0;
        for (int i = 0; i < weights.length; ) {
            int cap = x;    // 载货量
            while (i < weights.length) {
                if (weights[i] > cap) {
                    break;
                } else {
                    cap -= weights[i];
                    i++;
                }
            }
            days++;
        }
        return days;
    }
}