package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly nCm의 끝자리 0의 개수 구하기 조합으로 숫자 뽑고 String으로 캐스팅해서 character 배열로 바꾼
 *         후 0인 문자 수 출력 (단, 첫 숫자 제외)
 */

public class B_2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long n = Long.parseLong(input[0]);
		long m = Long.parseLong(input[1]);

		// Count the number of trailing zeros
		int cnt = countEndZero(n, m);

		System.out.println(cnt);
	}

	// n!의 2의 개수 - (m!의 2의 개수 + (n-m)!의 2의 개수)
	// n!의 5의 개수 - (m!의 5의 개수 + (n-m)!의 5의 개수)
	
	public static int countEndZero(long n, long m) {
		int countOf2 = countTwoFive(n, 2) - countTwoFive(m, 2) - countTwoFive(n - m, 2);
		int countOf5 = countTwoFive(n, 5) - countTwoFive(m, 5) - countTwoFive(n - m, 5);

		return Math.min(countOf2, countOf5);
	}

	public static int countTwoFive(long num, int twoFive) {
		int count = 0;
		while (num >= twoFive) {
			count += num / twoFive;
			num /= twoFive;
		}
		return count;
	}
}
