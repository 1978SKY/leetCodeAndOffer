import java.util.ArrayList;
import java.util.List;

/**
 * @author Deep
 * @create 2022-11-23
 */
public class Solution3 {
	public static void main(String[] args) {
		String str = ";Q;;Q;";
		String[] split = str.split(";",-1);
		System.out.println(split.length);


		for (int i = 0; i < split.length; i++) {
			System.out.println("i:"+split[i].length());
		}

		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(2);

		arrayList.removeIf(item-> item == 2);

		System.out.println(arrayList);

	}
}
