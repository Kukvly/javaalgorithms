package sv.silver_2;

/**
 * [배낭문제]
 * n<=20
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1535 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int l[] = new int [n+1]; // life
		int j[] = new int [n+1]; // joy
		
		int dp[][] = new int [n+1][101];
		
		String input1[] = br.readLine().split(" ");
		String input2[] = br.readLine().split(" ");
		for(int i=1; i<=n; i++) {
			l[i] = Integer.parseInt(input1[i-1]);
		}
		
		for(int i=1; i<=n; i++) {
			j[i] = Integer.parseInt(input2[i-1]);
		}
		
		// i: 사람의 순서
		// k: 현재의 체력
		// 인사하지 않는 경우: dp[i-1][k]
		// 인사하는 경우 : dp[i-1][k-l[i]] + j[i]
		
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=100; k++) {
				if(l[i]<=k) {
					dp[i][k] = Math.max(dp[i-1][k], dp[i-1][k-l[i]]+j[i]);
				} else {
					dp[i][k] = dp[i-1][k];
				}
			}
		}
		
		// k == 100이면 죽기 때문에 k == 99
		System.out.println(dp[n][99]);
	}

}
