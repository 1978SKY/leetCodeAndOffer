import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.combination(sc.nextInt(), sc.nextInt()));
    }

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * calculate combination Number
     *
     * @param r int整型
     * @param n int整型
     * @return int整型
     */
    public int combination(int r, int n) {
        // write code here
        int aN = 1, aR = 1;
        int nBak = n, rBak = r;
        if (n == 0) {
            aN = 1;
        } else {
            while (nBak > 0) {
                aN *= nBak;
                nBak--;
            }
        }

        if (r == 0) {
            aR = 1;
        } else {
            while (rBak > 0) {
                aR *= rBak;
                rBak--;
            }
        }

        if (n - r == 0) {
            return aN / aR;
        } else {
            int aRN = 1;
            int rnBak = n - r;
            while (rnBak > 0) {
                aRN *= rnBak;
                rnBak--;
            }
            return (aN / aR) / aRN;
        }
    }
}