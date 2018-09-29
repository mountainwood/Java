import java.util.*;
public class GeneriesDemo {

	public static void main(String[] args) {
		Map<String, String> tel = new HashMap<>();
		tel.put("John", "0939831209");
		tel.put("Mary", "0935768098");
		tel.put("Jean", "0931660123");
		String tell = tel.get("Mary");
		System.out.println(tell);
		for(String key: tel.keySet()) {
			System.out.println(key + ", " + tel.get(key));
		}
		for(String val: tel.values()) {
			System.out.println(val);
		}

	}

}

/*µ²ªG
 * Mary, 0935768098
0939831209
0931660123
0935768098
 */