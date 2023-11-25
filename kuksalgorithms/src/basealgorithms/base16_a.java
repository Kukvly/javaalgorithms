package basealgorithms;

/**
 * [1620]
 * 첫째 줄 입력1: 도감에 수록되어 있는 포켓몬의 개수 n
 * 첫째 줄 입력2: 도감에서 내가 맞춰야할 문제의 개수 M
 * 1 <= N,M < 100000
 * 
 * pocketmon.length = n
 * 첫글자만 대문자이거나, 마지막만 대문자
 * 포켓몬 이름의 최대 길이: 20, 포켓몬 이름의 최소 길이: 2
 * 
 * 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야 함
 * ex. chew -> 1, 1 -> chew
 * 
 * 입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같고,
 * 입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어짐
 * 
 * 26 5
 * 
 * 26 개의 포켓몬 입력
 * 1. Bulbasaur
 * 2. Ivysaur
 * 3. Venusaur
 * 4. Charmander
 * 5. Charmeleon
 * 6. Charizard
 * 7. Squirtle
 * 8. Wartortle
 * 9. Blastoise
 * 10. Caterpie
 * 11. Metapod
 * 12. Butterfree
 * 13. Weedle
 * 14. Kakuna
 * 15. Beedrill
 * 16. Pidgey
 * 17. Pidgeotto
 * 18. Pidgeot
 * 19. Rattata
 * 20. Raticate
 * 21. Spearow
 * 22. Fearow
 * 23. Ekans
 * 24. Arbok
 * 25. Pikachu
 * 26. Raichu
 * 
 * 5 개의 대답 입력
 * 1. 25		Pikachu
 * 2. Raichu	25
 * 3. 3			Venusaur
 * 4. Pidgey	16
 * 5. Kakuna	14
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class base16_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String pocketmon[] = new String[n + m + 1];
		String answer[] = new String[m + 1];

//        int cnt = 1;

		Map<String, String> paramMap = new HashMap<>();
		Map<String, String> answerMap = new HashMap<>();

		List<String> keyList = new ArrayList<String>();

		for (int i = 1; i < n + 1 + m; i++) {
			pocketmon[i] = br.readLine();
			paramMap.put(Integer.toString(i), pocketmon[i]);
//            System.out.println("paramMap: " + paramMap.get(Integer.toString(i)));
//        	System.out.println("pocketmon[" + i + "]: " + pocketmon[i]);
		}

		System.out.println("paramMap.toString(): " + paramMap.toString());
		for (int j = 1; j < m + 1; j++) {
			answer[j] = pocketmon[n + j];
//        	System.out.println("answer[" + j + "]: " + answer[j]);
			answerMap.put(Integer.toString(j), answer[j]);

//            for (Map.Entry<String, String> answerMap1 : paramMap.entrySet()) {
//    			if (answerMap1.getValue().equals(paramMap.get(pocketmon[1]))) {
//    				keyList.add(answerMap1.getKey());
//    				System.out.println("keyList: " + keyList.toString());
//    			}
//    		}
		}
		// answerMap의 요소가 paramMap 요소로 있으면 요소 answerMap의 요소 출력
		// paramMap의 요소가 answerMap 요소로 있으면 paramMap의 인덱스를 출력

		for (int x = 1; x < n + 1; x++) {
			for (int y = 1; y < m + 1; y++) {
				if (paramMap.get(Integer.toString(x)).equals(answerMap.get(Integer.toString(y)))) {

					if (paramMap.containsValue(answerMap.get(Integer.toString(y)))) {
						System.out.println(answerMap.get(Integer.toString(y)));
					} else if (paramMap.containsKey(x)) { // answerMap의 값이 paramMap의 key면
						// answerMap의 value가 paramMap의 key면 paramMap의 value를 출력 
						System.out.println("good");
//						System.out.println(x);
					}
				}
			}
		}

		/**
		 * x: paramMap index y: answerMap index
		 */

//        System.out.println("=================================");
//        System.out.println("paramMap.toString(): " + paramMap.get("1"));
//        System.out.println("answerMap.toString(): " + answerMap.get("1"));
//        System.out.println(paramMap.get("1").equals(answerMap.get("1")) );
//        

	}
}
