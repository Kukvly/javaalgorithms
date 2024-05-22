package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11051 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        System.out.println(binomialCoefficient(n, k));
    }

    public static int binomialCoefficient(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        int MOD = 10007;

        // Initialize base cases
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1; // C(i, 0) = 1
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j > i) {
                    dp[i][j] = 0;
                } else {
                	// �Ľ�Į�� �ﰢ��
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                }
            }
        }

        return dp[n][k];
    }
}
