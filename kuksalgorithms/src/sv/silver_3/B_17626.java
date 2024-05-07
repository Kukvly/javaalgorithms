package sv.silver_3;

/**
 * ex.
 * 15663 = 125^2 + 6^2 + 1^2 + 1^2
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_17626 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int [n+1];
		dp[0] = 0;
		
		for (int i=1; i<=n; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j=1; j*j <= i; j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
		
		System.out.println(dp[n]);
	}

}
