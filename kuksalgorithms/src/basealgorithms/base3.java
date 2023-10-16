package basealgorithms;

/**
 * <피보나치 함수 규칙>
 * fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
 * Cnt0: 1 0 1 1 2 3 5 
 * Cnt1; 0 1 1 2 3 5 8
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class base3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int t = Integer.parseInt(s);
		int arr[] = new int[t];

		for (int i = 0; i < t; i++) {
			int cnt0 = 0;
			int cnt1 = 0;
			String d = br.readLine();
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
