import java.util.HashMap;
import java.util.Map;

/**
 * @author Deep
 * @create 2022-11-03
 */
public class Main7 {
	public static void main(String[] args) {
		System.out.println((String) null);

		Map<String, Object> map = new HashMap<>();
		map.put("memo","");

		String generalMemo = "haha";

		String memo = (String) map.get("memo");
		if (memo == null || memo.length() <= 0) {
			memo = generalMemo;
		} else {
			memo = memo + "\n" + generalMemo;
		}
		map.put("memo", memo);

		System.out.println(map);

	}
}
