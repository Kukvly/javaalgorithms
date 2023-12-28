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

public class B_1105 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		String l = input[0];
		String r = input[1];
		
		long numL = Long.parseLong(l);
		long numR = Long.parseLong(r);

		String numArr[] = new String[(int) (Integer.parseInt(r) - Integer.parseInt(l)) + 1];
//		char c = '8';
//		int rank[] = new int[numArr.length];
		int minCnt = 9;
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = String.valueOf(Integer.parseInt(l) + i);
//			rank[i] = cntEight(numArr[i], '8');
			minCnt = Math.min(minCnt, cntEight(numArr[i], '8'));


		}
		System.out.println(minCnt);

//		Arrays.sort(rank);

//		System.out.println(rank[0]);

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
