package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * 1 <= n <= 1515
 * 
 * 0으로 시작하지 않고, 1과 5로만 구성된 n자리 양의 정수 중에
 * 15의 배수가 몇개 인지?
 * 
 * 답을 1,000,000,007로 나눈 나머지 출력
 *
 *
 *단순 15배수
n=2 ( 1~6) 6

n=3 (7 ~ 66) 60

n=4 (67 ~ 666) 600

n=5 (667 ~ 6666) 6000

1과 5

n=1 ->0

n=2 ->1
15 

n=3 ->1
105

n=4 ->


 *
 *
 */





public class B_20500 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));

		long MOD = 1000000007L;
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==1) {
			System.out.println(0);
			return;
		}
		
		long dp[][] = new long [3][n+1];
		dp[0][2] = dp[1][2] = 1;
		
		for(int i=3; i<=n; i++) {
			dp[0][i] = (dp[1][i-1] + dp[2][i-1]) % MOD;
			dp[1][i] = (dp[0][i-1] + dp[2][i-1]) % MOD;
			dp[2][i] = (dp[0][i-1] + dp[1][i-1]) % MOD;
		}
		
		System.out.println(dp[0][n]);
		
	}
}
