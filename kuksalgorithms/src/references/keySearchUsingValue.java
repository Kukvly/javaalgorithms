package references;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class keySearchUsingValue {

	public static void main(String[] args) {
		List<String> keyList = new ArrayList<String>();

		Scanner scan = new Scanner(System.in);

		String m = scan.next();
		String i = scan.next();
		String j = scan.next();

		Map<String, String> map = new HashMap<>();
		map.put("1", m);
		map.put("2", i);
		map.put("3", j);
		

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals(j)) {
//				keyList.add(entry.getKey());
				System.out.println("keyList: " + keyList.toString());
			} else if (entry.getValue().equals(m)) {
				keyList.add(entry.getKey());
//				System.out.println("keyList: " + keyList.toString());

			} else if (entry.getValue().equals(i)) {
				keyList.add(entry.getKey());
//				System.out.println("keyList: " + keyList.toString());
			}
		}
	}

}
