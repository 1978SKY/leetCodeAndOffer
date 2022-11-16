import java.util.*;

/**
 * @author Deep
 * @create 2022-09-17
 */
public class Main5 {

	//记录元素和其对应的次数
	private static final HashMap<String, Integer> countMap = new HashMap<>();
	//按顺序记录元素
	private static final List<String> lst = new ArrayList<>();
	//存储括号开始的位置
	private static final Stack<Integer> s = new Stack<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String element = sc.nextLine();

		System.out.println(countElement(element));
	}

	public static String countElement(String element) {

		for (int i = 0; i < element.length(); i++) {
			help(element);
		}

//		System.out.println(countMap);
//		System.out.println(lst);

		// 拼接结果
		StringBuilder ans = new StringBuilder();
		for (String item : lst) {
			if (countMap.containsKey(item)) {
				ans.append(item).append(countMap.remove(item));
			}
		}
		return ans.toString();
	}

	private static void help(String element) {
		char[] eleArr = element.toCharArray();

		for (int i = 0; i < eleArr.length; i++) {
			// 大写
			if (eleArr[i] >= 'A' && eleArr[i] <= 'Z') {
				int j = i + 1;
				// 取出后面所有小字母
				while (j < eleArr.length && eleArr[j] >= 'a' && eleArr[j] <= 'z') {
					j++;
				}
				String subElement = element.substring(i, j);
				if (!countMap.containsKey(subElement)) {
					countMap.put(subElement, 0);
				}
				lst.add(subElement);
				if (eleArr[j] >= '0' && eleArr[j] <= '9') {
					int sum = 0;
					while (j < eleArr.length && eleArr[j] >= '0' && eleArr[j] <= '9') {
						sum = sum * 10 + eleArr[j] - '0';
						j++;
					}
					Integer value = countMap.get(subElement) + sum;
					countMap.replace(subElement, value);
				} else {
					Integer value = countMap.get(subElement) + 1;
					countMap.replace(subElement, value);
				}
			}

			// 暂存左括号下表
			if (eleArr[i] == '(') {
				s.push(i);
			}

			// 计算右括号
			if (eleArr[i] == ')') {
				Integer l = s.pop();
				help(element.substring(l + 1, i));
			}
		}
	}
}
