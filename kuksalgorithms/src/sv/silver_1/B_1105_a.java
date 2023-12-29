package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

//		StringTokenizer st = new StringTokenizer(br.readLine());

//        String l = st.nextToken();
//        String r = st.nextToken();

		String l = input[0];
		String r = input[1];

		if (l.length() != r.length()) {
			System.out.println(0);
			return;
		}

		int numL = Integer.parseInt(l);
		int numR = Integer.parseInt(r);

		String numArr[] = new String[numR - numL + 1];
		int minCnt[] = new int[numArr.length];
//		int minCnt = 0; // 9
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.toString(numL + i);
			minCnt[i] = cntEight(numArr[i], '8');

		}
		Arrays.sort(minCnt);
		System.out.println(minCnt[0]);

	}

	private static int cntEight(String str, char num) {
		int cnt = 0;
		for (char c : str.toCharArray()) {
			if (c == num) {
				cnt++;
			}
		}

		return cnt;
	}

}
