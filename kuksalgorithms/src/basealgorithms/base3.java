package basealgorithms;

/**
 * <피보나치 함수 규칙>
 * fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
 * Cnt0: 1 0 1 1 2 3 5 
 * Cnt1; 0 1 1 2 3 5 8
 * 
 * 가진 숫자 개수
 * 가진 숫자 목록
 * 숫자 더미 개수
 * 숫자 더미 목록
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class base3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String card = br.readLine();
		int cardArr[] = new int[Integer.parseInt(card)];
		
		String d = br.readLine();
		StringTokenizer st1 = new StringTokenizer(d, " ");

		// for 문 index 별로 하나씩 넣을지
		// 토큰으로 쭉 받아서 구분지어 한방에 다 넣어줄지 고민할 것
		
		String chknum = br.readLine();
		
		StringTokenizer st2 = new StringTokenizer(chknum, " ");
		
		for (int i = 0; i < num; i++) {
			int cnt0 = 0;
			int cnt1 = 0;
			System.out.println("d: " + d);
			arr[i] = Integer.parseInt(d);

			int n = arr[i]; // 3
			System.out.println("n: " + arr[i]);
			if (n <= 40 || n == 0) {
				if (n == 0) {
					cnt0++;
				} else if (n == 1) {
					cnt1++;
				} else {
					fibonacci(n);
				}

			}
			System.out.println(cnt0 + " " + cnt1);
		}

	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
