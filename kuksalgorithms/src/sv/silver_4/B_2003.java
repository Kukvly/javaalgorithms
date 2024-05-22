package sv.silver_4;

/**
 * 투 포인터 문제
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		String input[] = br.readLine().split(" ");
		
		// arr.length
		int n = Integer.parseInt(input[0]);
		
		// target
		int m = Integer.parseInt(input[1]);
		
		int arr[] = new int [n];

		input = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			arr [i] = Integer.parseInt(input[i]);
		}
		
		int cnt=0, sum=0, start=0, end=0;
		
		// 부분 배열의 합 >= target -> left = left + 1
		
		while (start <= n) {
			if(sum >= m) {
				sum -= arr[start++];
			} else if(sum <m) {
				sum += arr[end++];
			}
			
			if(sum == m) cnt++;
		}
		
		System.out.println(cnt);
		
	}
	
}
