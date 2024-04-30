package sv.silver_5;

/**
 * (0<n<=m<30)
 * dp[i][j]: i개의 다리를 j개의 지점에 놓는 경우의 수
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1010 {

	static int[][] dp = new int [30][30];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String input[] = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int m = Integer.parseInt(input[1]);
			System.out.println(comb(m, n));
		}

	}

	public static int comb(int n, int r) {
		if (dp[n][r] > 0) {
			return dp[n][r];
		}

		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}
		
		return dp[n][r] = comb(n-1, r-1) + comb(n-1, r);
	}
}
