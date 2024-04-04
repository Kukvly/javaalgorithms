package sv.silver_2;

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
		
		for(int i=0; i<n; i++) {
			dp[i] = 
		}
		
		
	}

}
