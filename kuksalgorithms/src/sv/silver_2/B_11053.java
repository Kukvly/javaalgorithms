package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B_11053 {
	static int n;
	static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int dp[] = new int [n];
		arr = new int[n];
		String input[] = br.readLine().split(" ");
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
 		}
		
		Arrays.fill(dp, 1);
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			
			}
		}
		
		int max = 0;
		for(int i=0; i<n; i++) {
			max = Math.max(max, dp[i]);
		}
		System.out.println(max);
	}

}
