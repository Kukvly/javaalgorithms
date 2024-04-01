package sv.silver_1;

/**
 * ex. 45656은 계단수
 * 계단수
 * 인접한 모든 자리의 차이가 1
 * n이 주어질 때, 길이가 n인 계단 수가 총 몇 개인지 구해보자.
 * 0으로 시작하지는 않는다.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_10844 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long dp[][] = new long[n+1][10];
		
		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) {
					dp[i][j] = dp[i - 1][1] % 1000000000;
				} else if (j == 9) {
                    dp[i][j] = dp[i - 1][8] % 1000000000;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % 1000000000;
                }
			}
		}
		
		long sum = 0;
        // 길이가 N인 계단 수의 개수를 모두 더함
        for (int i = 0; i <= 9; i++) {
            sum += dp[n][i];
        }

        System.out.println(sum % 1000000000);
	}

}
