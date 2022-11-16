import java.util.*;

/**
 * @author Deep
 * @create: 2022-09-04
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums1 = new ArrayList<>(n);
        while (n-- > 0) {
            nums1.add(sc.nextInt());
        }
        while (m-- > 0) {
            List<Integer> bak = new ArrayList<>(nums1);
            Collections.reverse(nums1);
            bak.addAll(nums1);
            nums1 = bak;
        }
        System.out.println(nums1.size());
        System.out.println(nums1.get(k - 1));
    }
}
