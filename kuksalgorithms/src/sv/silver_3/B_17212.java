package sv.silver_3;

/*
 * 35원 -> 35/7 = 5
 * 35원 -> 35/5 = 7
 * 36원 -> 36/7
 * 17원 -> 
 * n%7 = 3 -> 
 * n%5 = 2
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_17212 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1원 2원 5원 7원
		int n = Integer.parseInt(br.readLine());

		int coins[] = {1, 2, 5, 7};
		
		int dp[] = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			dp[i] = Integer.MAX_VALUE;
		}
		
		for(int i=1; i<=n; i++) {
			for(int coin : coins) {
				System.out.println(i+ ". coin: " + coin);
				if(i >= coin && dp[i-coin] != Integer.MAX_VALUE) {
					dp[i] = Math.min(dp[i], dp[i-coin] + 1);
				}
			}
		}
		
		System.out.println(dp[n]);
	}

}
