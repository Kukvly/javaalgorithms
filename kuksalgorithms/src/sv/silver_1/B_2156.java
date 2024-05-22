package sv.silver_1;

/**
 * 1. 포도주 선택하면 그 잔을 다 마셔야 하고, 다 마신 후에는 원래 위치에 다시 놓아야 함.
 * 2. 연속으로 놓여 있는 3잔 마시기 불가능
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2156 {
	
	static int dp[], podo[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		podo = new int [n+1];
		dp = new int [n+1];
		
		for(int i=1; i<=n; i++) {
			podo[i] = Integer.parseInt(br.readLine());
		}
		
		dp[1] = podo[1];
		dp[2] = podo[1] + podo[2];
		
		for (int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+podo[i], dp[i-3] + podo[i-1]+podo[i]));
		}
		
		System.out.println(dp[n]);
		
	}

}
