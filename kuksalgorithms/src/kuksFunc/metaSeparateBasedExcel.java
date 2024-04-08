package kuksFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class metaSeparateBasedExcel {

	public static void main(String[] args) throws IOException {
		List<String> kuksList = new ArrayList<String>();

		
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String paramArr[] = new String[10];
		for (int idx = 0; idx < paramArr.length; idx++) {
			paramArr[idx] = br.readLine();

			List<String> tokens = new ArrayList<>();
			StringBuilder word = new StringBuilder();
			String input = paramArr[idx];
			for (int i = input.length() - 1; i >= 0; i--) {
				char c = input.charAt(i);
				word.insert(0, c); // 새로운 글자를 앞쪽에 추가
//				System.out.println("kuks_chk: " + word);
				// 만약 현재 글자가 리스트에 포함된다면
				if (kuksList.contains(word.toString())) {
					tokens.add(0, word.toString()); // 리스트 앞쪽에 추가
					word.setLength(0); // StringBuilder 초기화
				}
			}

			// 마지막으로 남은 단어를 추가
			if (word.length() > 0) {
				tokens.add(0, word.toString());
			}

			// 결과 출력
			for (String token : tokens) {
				System.out.print(token + "/");
			}
			System.out.println();
		}
	}
}