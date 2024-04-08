package sv.silver_2;

/**
 * 첫째 줄에 수열 A의 크기 n (1<=n<=1000)
 * 둘째 줄에는 수열 A를 이루고 있는 A[i]가 주어진다. (1<=A[i]<=1000)
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_11055 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Integer> paramList = new ArrayList<Integer>();
		
		String input[] = br.readLine().split(" ");
		
		int paramArr[] = new int[n];
		
		int dp[] = new int [n];
		
		for(int i=0; i<n; i++) {
			paramArr[i] = Integer.parseInt(input[i]);
		}
		
		dp[0] = paramArr[0];
		
		for(int i=1; i<n; i++) {
			if(paramArr[i] > paramArr[i-1] ) {
				dp[i] = dp[i-1] + 
			}

		}
		
		
	}

}
