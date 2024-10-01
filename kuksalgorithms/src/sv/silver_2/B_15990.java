package sv.silver_2;

/*
 * n < 100,000
 * 
 * 
 * */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_15990 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int maxN = 100000;
		
		long dp[][] = new long [maxN +1][4];
		
        // 기저 사례 설정
        dp[1][1] = 1; // 1
        dp[2][2] = 1; // 2
        dp[3][1] = 1; // 1 + 2
        dp[3][2] = 1; // 2 + 1
        dp[3][3] = 1; // 3

		
        for (int i=4; i<=maxN; i++) {
        	dp[i][1] = (dp[i-1][2] + dp[i-1][3]) % 1000000009;
        	dp[i][2] = (dp[i-2][1] + dp[i-2][3]) % 1000000009;
        	dp[i][3] = (dp[i-3][1] + dp[i-3][2]) % 1000000009;
        }
        
        
        
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			long rtn = (dp[n][1] + dp[n][2] + dp[n][3]) % 1000000009;
			System.out.println(rtn);
			
		}
		
		
	}

}
