package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11727 {

	static int dp[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1<=n<=1000
		int n = Integer.parseInt(br.readLine());

		dp = new int[n + 1];

		dp[1] = 1;
		dp[2] = 3;

		if (n == 1) {
			System.out.println(n);
			return;
		} else if (n == 2) {
			System.out.println(3);
			return;
		} else {
			for (int i = 3; i <= n; i++) {
				dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
			}

		}

		System.out.println(dp[n]);
	}

}
