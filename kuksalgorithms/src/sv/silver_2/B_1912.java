package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_1912 {
	
	static int arr[], dp[];
	static int n;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
		arr = new int [n];
		dp  = new int [n];
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		dp[0] = arr[0];
		int maxSum = dp[0];
		
		
		for(int i=1; i<n; i++) {
			dp[i] = Math.max(arr[i], dp[i-1]+arr[i]);
			maxSum = Math.max(maxSum, dp[i]);
		}
		
		System.out.println(maxSum);
	}

}
