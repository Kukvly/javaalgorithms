package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

		String textArr[] = new String[c + a];

		for (int i = 0; i < c; i++) {
			input = br.readLine().split(" -> ");
			textArr[i] = input[0].replace("\"", "");
//			System.out.println(textArr[i]);
		}
		for (int i = c; i < (c + a); i++) {
			input = br.readLine().split(" -> ");
			textArr[i] = input[1].replace("\"", "") + " (" + input[0].replace("\"", "") + ")";
//			System.out.println(textArr[i]);
		}

		for (int i = 0; i < c+a; i++) {
			System.out.println(textArr[i]);
		}
	}

}
