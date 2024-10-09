package sv.silver_4;

/**
 * n <= 50
 * arr[i], brr[i] <= 100
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1026 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String inputa[] = br.readLine().split(" ");
		String inputb[] = br.readLine().split(" ");
		int arr[] = new int[n];
		int brr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(inputa[i]);
			brr[i] = Integer.parseInt(inputb[i]);
		}
		
		Arrays.sort(arr);
		Arrays.sort(brr);
		int s = 0;
		for(int i=0; i<n; i++) {
			s += arr[i] * brr[n-i-1];
		}
		
		System.out.print(s);
	}

}
