package sv.silver_2;

/**
 * r번째 줄의 c번째 수는 (r,c)에 놓여져 있는 사탕의 개수
 * (r,c)에 있으면 (r+1,c), (r,c+1), (r+1,c+1)로 이동 가능
 * 각 방 방문시 사탕 가져감 -> 또 미로 밖으로 나갈 수 없음
 * 
 * 0 <= 사탕의 개수 <= 100
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11048 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int arr[][] = new int[n+1][m+1];
		int dp[][] = new int[n+1][m+1];
		for(int i=1; i<=n; i++) {
			input = br.readLine().split(" ");
			for(int j=1; j<=m; j++) {
				arr[i][j] = Integer.parseInt(input[j-1]);
			}
		}
		dp[1][1] = arr[1][1];
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j - 1], dp[i - 1][j - 1])) + arr[i][j];
			}
		}
		
		System.out.println(dp[n][m]);
	}

}
