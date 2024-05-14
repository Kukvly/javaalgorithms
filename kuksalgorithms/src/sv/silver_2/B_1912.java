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
	static List<Integer> kuksList;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
		arr = new int [n];
		dp  = new int [n];
		
		kuksList = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i]<arr[j]) {
					dp[i] = Math.max(dp[i], dp[i] + arr[j]);
				}
				
			}
			kuksList.add(dp[i]);
		}
		Collections.sort(kuksList);
		System.out.println(kuksList.get(kuksList.size()-1));
	}

}
