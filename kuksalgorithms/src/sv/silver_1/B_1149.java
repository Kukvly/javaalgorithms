package sv.silver_1;

/**
 * n: 집의 수
 * 집은 R, G, B 중 하나의 색으로 칠한다.
 * 1번 집의 색은 2번 집의 색과 달라야 함
 * n번 집의 색은 n-1번 집의 색과 달라야 함
 * i (2<=i<=n-1)번 집의 색은 i-1번, i+1번 집의 색과 달라야 함
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1149 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		int cost[][] = new int [n+1][4];
		
		for (int i=1; i<=n; i++) {
			String input[] = br.readLine().split(" ");
			for (int j=1; j<=3; j++) {
				cost[i][j] = Integer.parseInt(input[j-1]);
			}
		}
		
		
		/**
		 * dp 2차원 배열이 아닌 dp[] 1차원 배열로 푸는 접근을 하였음
		 * 그로 인해 추가로 1차원 배열을 하나 더 생성하려고 했고, 그 과정에서 진전이 없었음
		 * 
		 * 그래서 dp를 2차원 배열로 생성하여 아래와 같이 초기화를 해준 후 풀었음
		 * 
		 * 접근과 사고방식은 7~80% 정도 되었으나
		 * 구현이 미흡하여 60% 정도 밖에 되지 않았음
		 * 
		 * 조금 아쉬웠던 문제
		 */
		
		
		int dp[][] = new int[n+1][4];
		dp[1][1] = cost[1][1];
		dp[1][2] = cost[1][2];
		dp[1][3] = cost[1][3];
		
		for (int i=2; i<=n; i++) {
			dp[i][1] = Math.min(dp[i-1][2], dp[i-1][3]) + cost[i][1];
			dp[i][2] = Math.min(dp[i-1][1], dp[i-1][3]) + cost[i][2];
			dp[i][3] = Math.min(dp[i-1][1], dp[i-1][2]) + cost[i][3];
		}
		
		int rtn = Math.min(dp[n][1], Math.min(dp[n][2], dp[n][3]));
		
		System.out.println(rtn);

	}

}
