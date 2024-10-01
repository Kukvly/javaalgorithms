package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2491 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
		int arr[] = new int [n];
		int incDp = 1;
		int decDp = 1;
		int maxLen = 1;
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		// increase logic
		for (int i=1; i<n; i++) {
			if(arr[i-1] <= arr[i]) {
				incDp++;
			} else {
				incDp = 1;
			}
			
			if(arr[i-1] >= arr[i]) {
				decDp++;
			} else {
				decDp = 1;
			}
			
			maxLen = Math.max(maxLen, Math.max(incDp, decDp));
		}
		
		System.out.println(maxLen);
		
		
	}

}
