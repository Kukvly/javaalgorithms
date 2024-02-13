package gd.gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// f(n) = f(n-1) + f(n-2)
// 피보나치는 이정도 수준이 최고 수준인 것 같음

public class B_2749 {
	static final int MOD = 1000000;
	static final int PISANO = 1500000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(fibonacci(n));

	}

	public static long fibonacci(long n) {
		long[] arr = new long[(int) (PISANO+1)];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<=PISANO; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % MOD;
		}
		return arr[(int) (n%PISANO)];
	}
}
