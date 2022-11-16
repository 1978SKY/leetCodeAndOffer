import java.math.BigInteger;

/**
 * @author Deep
 * @create 2022-11-15
 */
public class Solution1 {
	public static void main(String[] args) {
		System.out.println(compute("", "1111111111111111111"));
//		System.out.println(99999999999999 + 111);
		BigInteger num1 = new BigInteger("0");
		BigInteger num2 = new BigInteger("1111111111111111111");
		System.out.println(num1.add(num2));

	}

	private static String compute(String str1, String str2) {
		int index1 = str1.length();
		int index2 = str2.length();
		StringBuilder res = new StringBuilder();
		int maxLen = Math.max(index1, index2);
		int carry = 0;
		for (int i = maxLen; i > 0; i--) {
			int c1 = 0, c2 = 0;
			if (index1 > 0) {
				c1 = Integer.parseInt(str1.substring(index1 - 1, index1));
				index1--;
			}
			if (index2 > 0) {
				c2 = Integer.parseInt(str2.substring(index2 - 1, index2));
				index2--;
			}
			int sum = c1 + c2 + carry;
			carry = sum / 10;
			res.append(sum % 10);
		}
		if (carry > 0) {
			res.append(carry);
		}
		return String.valueOf(res.reverse());
	}
}
