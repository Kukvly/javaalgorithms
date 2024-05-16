package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_13699 {

	static int n, rtn;
	static long dp[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		dp = new long [36];
		
		dp[0] = 1;
		
		for (int i=1; i<=n; i++) {
			for(int j=0; j<i; j++) {
				dp[i]+=dp[j]*dp[i-j-1];
			}
		}
		
		System.out.println(dp[n]);
	}

}
