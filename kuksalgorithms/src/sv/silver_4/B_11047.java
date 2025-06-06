package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author kukvly
 * 
 * coin kind: n
 * 
 * sum: k
 * 
 */

public class B_11047 {

	public static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		long k = Long.parseLong(input[1]);
		
		long arr[] = new long[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}

		Arrays.sort(arr);
		for(int i=n-1; i>=0; i--) {
			if((k>=arr[i])) {
				cnt += (k/arr[i]);
				k%=arr[i];
			}
		}
		System.out.print(cnt);
	}

}
