package sv.silver_5;

/**
 *  N은 0보다 크거나 같고 50보다 작거나 같은 정수이고, M은 1,000보다 작거나 같은 자연수이다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1817 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]); // max
		
		int arr[] = new int[n];
		int cnt = 1;
		
		if(n==0) {
			System.out.println(0);
			return;
		}
				
		input = br.readLine().split(" ");

		int tmp=0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
			if(tmp + arr[i]>m) {
				cnt++;
				tmp = arr[i];
			} else {
				tmp += arr[i];
			}
		}
		

		System.out.println(cnt);
		
		
		
	}

}
