package pt.platinum4;

import java.io.*;

/**
 * 
 * @author kukvly
 * 
 * 평범한 배낭2 [플래4]
 * 
 * 1 <= v <= m
 * 1 <= c,k <= 10000
 * 1 <= v*k <= 10000
 */

public class B_12920_my {
	
	public static int v[], c[], dp[][];
	public static int n, m, k, num;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input[] = br.readLine().split(" ");
		// 물건 종류 수
		n = Integer.parseInt(input[0]);	// 1<=n<=100
		
		// 가방 최대 무게
		m = Integer.parseInt(input[1]); // 1<=m<=10000
		v = new int[n+1];
		c = new int[n+1];
		// v: 물건의 무게
		// c: 만족도 (= 가중치)
		// k: 물건 개수
		// dp[i][j]: i번째 물건까지 고려했을 때 무게가 j인 배낭에 담을 수 있는 최대 가치
		
		k = 1;
		num = 1;
		for(int i=1; i<=n; i++) {
			input = br.readLine().split(" ");
			int tmp = Integer.parseInt(input[2]);
			
			for (int j=num; j<=tmp; j++) {
				v[j] = Integer.parseInt(input[0]); 
				c[j] = Integer.parseInt(input[1]);
				k++;
			}
			num += tmp;
		}
		
		System.out.println("k: " + k);

		dp = new int[k+1][m+1];
		
		for (int i=1; i<=k; i++) {
			for (int j=1; j<=m; j++) {
				if(c[i]<=j) {
					dp[i][j] = Math.max((dp[i-1][j]),dp[i-1][j-c[i]]+v[i]);
				} else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		bw.write(String.valueOf(dp[k][m]));
		bw.close();
	}

}
