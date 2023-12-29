package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
			a = a * nArr[i];
		}

		// m
		int m = Integer.parseInt(br.readLine());
		long mArr[] = new long[m];

		long b = 1;

		String mm[] = br.readLine().split(" ");

		for (int i = 0; i < m; i++) {
			mArr[i] = Long.parseLong(mm[i]);
			b = b * mArr[i];
		}

		if (a >= b) {
			long maxDiv[] = new long[(int)a];
			for (int i = 0; i < a; i++) {
				if (a % (i + 1) == 0 && b % (i + 1) == 0) {
					maxDiv[i] = i + 1;
					System.out.println("maxDiv["+i+"]: "+maxDiv[i]);
				}
			}
			long rtn = calMaxDiv(maxDiv);
			if (Long.toString(rtn).length() > 9) {
				System.out.println(result(rtn));
			} else {
				System.out.println(rtn);
			}

			return;
		} else if (a < b) {
			long maxDiv[] = new long[(int)b];
//			List<Long> divList = new ArrayList<>();
			for (int i = 0; i < b; i++) {
				if (a % (i + 2) == 0 && b % (i + 2) == 0) {
					maxDiv[i] = i + 2;
					System.out.println(maxDiv[i]);
				}
			}
			long rtn = calMaxDiv(maxDiv);
			if (Long.toString(rtn).length() > 9) {
				System.out.println(result(rtn));
			} else {
				System.out.println(rtn);
			}
			return;
		}
	}

	public static long calMaxDiv(long arr[]) {
		// 내림차순으로 정렬
		Arrays.sort(arr);
		// 배열을 뒤집어서 내림차순으로 만듦
		for (int i = 0; i < arr.length / 2; i++) {
			long temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		return arr[0];
//		return arr[arr.length-1];
	}

	public static String result(long rtn) {
		String tmp = Long.toString(rtn);
		String str = tmp.substring(tmp.length() - 9, tmp.length());
		return str;
	}

}
