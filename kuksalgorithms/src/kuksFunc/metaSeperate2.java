package kuksFunc;

/**
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class metaSeperate2 {

	public static void main(String[] args) throws IOException {
		Map<String, String> kuksMap = new HashMap<String, String>();

//	      kuksMap.put("병원", "HSP");
//	      kuksMap.put("종별", value)

		List<String> kuksList = new ArrayList<String>();
		kuksList.add("병원");
		kuksList.add("명");
		kuksList.add("구분");
		kuksList.add("코드");
		kuksList.add("종별");
		kuksList.add("모집자");
		kuksList.add("인사");
		kuksList.add("번호");
		kuksList.add("채널");
		kuksList.add("구분");
		kuksList.add("코드1");
		kuksList.add("코드2");
		kuksList.add("피보험자");
		kuksList.add("고객");
		kuksList.add("치료");
		kuksList.add("시작");
		kuksList.add("종료");
		kuksList.add("일자");
		kuksList.add("지급");
		kuksList.add("청구");
		kuksList.add("산출");
		kuksList.add("보험");
		kuksList.add("금액"); // AM
		kuksList.add("금"); // AM
		kuksList.add("면책");

		kuksList.add("결정");
		kuksList.add("마감");
		kuksList.add("월");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * String kuksArr[] = new String[2]; for (int i=0; i<kuksArr.length; i++) {
		 * kuksArr[i] = br.readLine(); }
		 */
		String input = br.readLine();
		// 문자열을 구분하여 출력
		// 문자열을 kuksList에 포함된 문자열로 분리하여 출력
		List<String> tokens = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j <= input.length(); j++) {
				String substring = input.substring(i, j);
				if (kuksList.contains(substring) && String.valueOf(substring).equals("금액")) {
					System.out.println("1");
					tokens.add("금액");
					i = j - 1;
					break;
				} else if (kuksList.contains(substring) && String.valueOf(substring).equals("금")) {
					System.out.println("2");
					tokens.add("금");
					i = j - 1;
					break;
				} else if (kuksList.contains(substring)) {
					System.out.println("3");
					System.out.println("substring: " + substring);
					tokens.add(substring);
					i = j - 1;
					break;
				}
			}
		}

		// 결과 출력
		for (String token : tokens) {
			System.out.print(token + "/");
		}
		
		/*
		
		System.out.println();
		System.out.println("#################################################");
		System.out.println("#######  ########  ########  ########  ##########");
		System.out.println("#########  ########  ########  ########  ########");
		System.out.println("#######  ########  ########  ########  ##########");
		System.out.println("#################################################");
		
		// kuksList
//		String param = br.readLine();
		*/
	}

}
