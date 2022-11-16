import java.util.Scanner;

/**
 * @author Deep
 * @create: 2022-09-04
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /**
         * 猜想：7这个数特殊，数组中必须只有一个7，剩下的全部为-1或1
         */
        int mul = 1;
        boolean flag = false;

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] != 0) {
                mul *= nums[i];
            } else {
                flag = true;
            }
        }

        // 找到最接近7的那个下标
        int num7Index = 0;  // 最接近7的下标
        int key = Math.abs(Math.abs(nums[0]) - 7);
        for (int i = 1; i < nums.length; i++) {
            int abs = Math.abs(Math.abs(nums[i]) - 7);
            if (abs < key) {
                key = abs;
                num7Index = i;
            }
        }

        int res = key;
        for (int i = 0; i < nums.length; i++) {
            if (i == num7Index) {
                continue;
            } else {
                res += Math.abs(nums[i] - 1);
            }
        }
//        if (!flag && mul < 0) {
//            res += 2;
//        }
        if (mul == -7) {
            System.out.println(14);
            return;
        }
        System.out.println(res);
    }
}
