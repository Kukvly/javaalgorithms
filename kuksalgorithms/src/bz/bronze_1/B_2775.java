package bz.bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kukvly 아파트 거주 조건 1. a층의 b호에 살려면 자신의 아래 a-1층의 1호부터 b호까지 사람들의 수의 합만큼
 *         사람들을 데려와 살아야 한다. 2. 아파트에 빈 집은 없고, 모든 거주민이 이 조건을 지켜왔다. 3. k층에 n호에는 몇
 *         명이 살고 있는지 출력해라. 4. 아파트는 0층부터 있고, 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 *
 */

public class B_2775 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int k = Integer.parseInt(br.readLine()); // k층
			int n = Integer.parseInt(br.readLine()); // n호
			int dp[][] = new int[k+1][n+1];
			
			// 0층 거주자 초기화
			for(int j=1; j<=n; j++) {
				dp[0][j] = j;
			}
		
			// 층별로 각 호수의 거주자 수 계산
			for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= n; l++) {
                    for (int m = 1; m <= l; m++) {
                        dp[j][l] += dp[j - 1][m];
                    }
                }
            }

			/**
			 * 0층의 i호에는 i명이 산다.
			 * k층의 n호에 살려면 k-1층의 1호 ~ n호 까지 사람들의 수의 합만큼 사람들을 데려와야 함
			 * 
			 * 0층 1호: 1명
			 * 0층 2호: 2명
			 * 0층 3호: 3명
			 * 
			 * 1층 1호: 1명
			 * 1층 2호: 1+2명
			 * 1층 3호: 1+2+3명
			 * 
			 * 2층 1호: 1명
			 * 2층 2호: 1 + 1+2 명
			 * 2층 3호: 1+ 1+2 + 1+2+3 명
			 */
			
			System.out.println(dp[k][n]);
		}
	}

}
