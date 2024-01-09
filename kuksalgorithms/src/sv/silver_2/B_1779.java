package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author kukvly n m 입력 n개는 '들어간 문장 풀어서 출력할 문구 개수 m개는 약어를 풀어서 출력할 문구 개수
 * 
 *         n+m개가 입력된 후 바로 다음줄에 문장 입력 해당 문장에서 n, m개의 입력된 문구들이 최초로 나올 때에만 변환
 * 
 *         다 입력 후 엔터를 해도 위에꺼랑 이어지지만, #이 나오면 다시 초기화
 * 
 *
 */

public class B_1779 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int c = Integer.parseInt(input[0]);
		int a = Integer.parseInt(input[1]);

		String textArrBef[] = new String[c];
		String textArrAft[] = new String[a];
		
		Map<String, String> textMap = new HashMap<>();
		Map<String, String> wordMap = new HashMap<>();

		for (int i = 0; i < c; i++) {
			input = br.readLine().split(" -> ");
			textMap.put(input[0].replace("\"", ""), input[1].replace("\"", ""));
		}
		
		for (int i = 0; i < a; i++) {
			input = br.readLine().split(" -> ");
			textArrBef[i] = input[0].replace("\"", "");
			textArrAft[i] = input[1].replace("\"", "");
			wordMap.put(input[0].replace("\"", ""), input[1].replace("\"", ""));
		}
		int cnt =0;
		while (cnt<2) {
            String line = br.readLine().replaceAll("\"", "");
          
            if (line.equals("#")) {
                cnt++;
            }

            // Process contractions
            for (Map.Entry<String, String> entry : textMap.entrySet()) {
                String contraction = entry.getKey();
                String expansion = entry.getValue();

                line = line.replaceFirst(contraction, expansion);
          }

            // Process acronyms
            for (Map.Entry<String, String> entry : wordMap.entrySet()) {
                String acronym = entry.getKey();
                String expansion = entry.getValue();

                line = line.replaceFirst("\\b" + acronym + "\\b", expansion + " (" + acronym + ")");
           }
            // Check for termination

            System.out.println(line);
        }
	}
}
