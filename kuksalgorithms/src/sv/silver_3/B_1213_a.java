package sv.silver_3;

/**
 * 1<=str.length<=50
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B_1213_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(str);
		
		Map<Character, Integer> charCount = new HashMap<>();
		// 각 문자의 개수를 세기
		for (char c : str.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}

		List<Character> palindrome = new ArrayList<>();
		List<Character> middle = new ArrayList<>(); // 중앙에 배치할 문자를 저장하는 리스트
		// 각 문자의 개수를 확인하여 팰린드롬 구성
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			char c = entry.getKey();
			int count = entry.getValue();
			// 짝수인 경우에는 해당 문자를 count/2만큼 추가
			for (int i = 0; i < count / 2; i++) {
				palindrome.add(c);
			}
			// 홀수인 경우 중앙에 배치할 문자로 저장
			if (count % 2 != 0) {
				middle.add(c);
			}
		}

		// 팰린드롬 불가능한 경우
		if (middle.size() > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}

		// 중앙에 배치할 문자가 있다면 추가
		if (!middle.isEmpty()) {
			palindrome.add(middle.get(0));
		}

		// 거꾸로 출력하여 팰린드롬 완성
		for (int i = palindrome.size() - 1; i >= 0; i--) {
			System.out.print(palindrome.get(i));
		}
		// 팰린드롬 출력
		for (char c : palindrome) {
			System.out.print(c);
		}
		System.out.println();
	}

}
