package sv.silver_3;

/**
 * dp[i]: i를 1로 만들기 위해 필요한 최소 연산 수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

        System.out.println(Cal(x));
	}

	public static int Cal(int n) {
		int[] dp = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;  // 1을 뺀 경우
            
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);  // 2로 나눈 경우
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);  // 3으로 나눈 경우
            }
        }

        return dp[n];
	}

}
