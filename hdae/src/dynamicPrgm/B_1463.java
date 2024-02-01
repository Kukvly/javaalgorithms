package dynamicPrgm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * x%3==0 -> x/3
 * x%2==0 -> x/2
 * x-1
 * 
 * 10 -> 9 -> 3 -> 1
 */

public class B_1463 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1 <= n <= 10^6
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Cal(n));
	}
	
	public static int Cal(int n) {
		int[] div = new int[n+1];	// 0으로 초기화
		
		for (int i=2; i<=n; i++) {
			div[i] = div[i-1] + 1;	// 1을 뺀 경우

			if (i%2 == 0) {
				div[i] = Math.min(div[i], div[i/2] + 1); // 2로 나눈 경우
			}
			
			if (i%3 == 0) {
				div[i] = Math.min(div[i], div[i/3] + 1); // 3으로 나눈 경우
			}
		}
	
		return div[n];
	}


}
