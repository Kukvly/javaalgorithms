package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly L <= n <= R 1<=L<=2,000,000,000 L<=R<=2,000,000,000
 * 
 *         n 중에서 8이 가장 적게 들어있는 수에 들어있는 8의 개수 구하기
 *
 */

public class B_1105_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");

		String l = input[0];
		String r = input[1];

		int numL = Integer.parseInt(l);
		int numR = Integer.parseInt(r);

		int minCnt = cntEight(numL, numR);
		System.out.println(minCnt);
	}

	private static int cntEight(int numL, int numR) {
		String l = Integer.toString(numL);
		String r = Integer.toString(numR);

		if (l.length() != r.length()) {
			return 0; // 자릿수가 다르면 8이 나올 수 없음
		}

		int cnt = 0;

		for (int i = 0; i < l.length(); i++) {
			if (l.charAt(i) == '8' && r.charAt(i) == '8') {
				cnt++; // 8이 나온 부분까지는 모두 8이 나와야 함
			} else if (l.charAt(i) != r.charAt(i)) {
				break; // 자리수가 같은데 8이 아닌 숫자가 나오면 종료
			}
		}
		return cnt;
	}

}
