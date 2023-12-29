package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly n개의 수를 모두 곱하면 a m개의 수를 모두 곱하면 b
 * 
 *         a와 b의 최대공약수 구하기 1<=n<=1000 1<=m<=1000
 * 
 *         입력 숫자들 < 1,000,000,000
 * 
 *         if(rtn.length>9)
 */

public class B_2824 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n
		int n = Integer.parseInt(br.readLine());
		long nArr[] = new long[n];

		long a = 1;

		String nn[] = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			nArr[i] = Long.parseLong(nn[i]);
			a = (a * nArr[i]);// % 1000000000;
		}

		// m
		int m = Integer.parseInt(br.readLine());
		long mArr[] = new long[m];

		long b = 1;

		String mm[] = br.readLine().split(" ");

		for (int i = 0; i < m; i++) {
			mArr[i] = Long.parseLong(mm[i]);
			b = (b * mArr[i]);// % 1000000000;
		}

		String rtn = Long.toString(gcd(a, b));

		if (rtn.length() > 9) {
			rtn = rtn.substring(rtn.length() - 9);
		}

		System.out.println(rtn);

	}

	public static long gcd(long a, long b) {
		while (b != 0) {
			long tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
}