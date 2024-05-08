package practice;

/**
 * 배낭문제 [표준]
 * 
 * # 최대무게: 5
 * 물건		A 	 B 	  C    D
 * 가치		30 	 20   40   10
 * 무게		1 	 2 	  3    4
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class napsack {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); //	물건 개수
		int k = Integer.parseInt(br.readLine()); // 최대 무게
		
		int dp[][] = new int [n+1][k+1];
		int w[] = new int [n+1];
		int v[] = new int [n+1];
		
		String input1[] = br.readLine().split(" ");
		String input2[] = br.readLine().split(" ");
		
		
		for(int i=1; i<=n; i++) {
			w[i] = Integer.parseInt(input1[i-1]);
		}
		
		for(int i=1; i<=n; i++) {
			v[i] = Integer.parseInt(input2[i-1]);
		}
		
	    for (int i=1; i<=n; i++) {
	    	for(int j=1; j<=k; j++) {
	    		if(w[i]<=j) {
	    			dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-w[i]]+v[i]);
	    		} else {
	    			dp[i][j] = dp[i-1][j];
	    		}
	    	}
	    }
	    System.out.println(dp[n][k]);
	}
}
