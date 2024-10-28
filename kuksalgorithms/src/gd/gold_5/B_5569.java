package gd.gold_5;

import java.io.*;

/**
 * 
 * @author kukvly
 * (2 <= w,h <= 100)
 * 
 * (1,1) -> (w,h) 가는 경로
 * 
 * 
 */


public class B_5569 {
	
	public static int dp[][][][];
	public static int cnt, mod;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
		
		String input[] = br.readLine().split(" ");
		int w = Integer.parseInt(input[0]);
		int h = Integer.parseInt(input[1]);
		
		mod = 100000;
		// arr[i][j][dir][turn] dir(0:오른쪽 1:위쪽) turn(0:꺾X 1:꺾O)
		dp = new int [w+1][h+1][2][2];
		
		for(int i=1; i<=w; i++) {
			dp[i][1][0][0] = 1; // 오른쪽 방향 시작
		}
		
		for(int j=1; j<=h; j++) {
			dp[1][j][1][0] = 1; // 위쪽 방향 시작 
		}
		
		for(int i=2; i<=w; i++) {
			for(int j=2; j<=h; j++) {
		        dp[i][j][1][0] = (dp[i][j - 1][1][1] + dp[i][j - 1][1][0]) % mod;
		        dp[i][j][1][1] = dp[i][j - 1][0][0] % mod;
		        dp[i][j][0][0] = (dp[i - 1][j][0][0] + dp[i - 1][j][0][1]) % mod;
		        dp[i][j][0][1] = dp[i - 1][j][1][0] % mod;
		        
//		        System.out.println("dp["+i+"]["+j+"][1][0]: " + dp[i][j][1][0]);
//		        System.out.println("dp["+i+"]["+j+"][1][1]: " + dp[i][j][1][1]);
//		        System.out.println("dp["+i+"]["+j+"][0][0]: " + dp[i][j][0][0]);
//		        System.out.println("dp["+i+"]["+j+"][0][1]: " + dp[i][j][0][1]);
		        if(i==w && j==h) {
		        	cnt = (dp[i][j][1][0] + dp[i][j][1][1] + dp[i][j][0][0] + dp[i][j][0][1]) % mod;
		        }
			}
		}
		
		bw.write(String.valueOf(cnt));
		bw.close();
	}

}
