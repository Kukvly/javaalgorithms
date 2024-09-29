package sv.silver_4;

/*
 * n: 실수
 * arr -> 각 요소는 0.0 ~ 9.9
 * 1.1 0.7 1.3 0.9 1.4 0.8 0.7 1.4
 * 연속된 수들의 곱이 최대가 되는 부분을 찾아 그 곱을 출력
 * 
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2670 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		double dp[] = new double[n];
		double arr[] = new double[n];
		double maxVal = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}

		dp[0] = arr[0];
		
		// 부분곱의 최대값
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(arr[i], dp[i - 1] * arr[i]);
			maxVal = Math.max(maxVal, dp[i]);
		}
	

		// 부분합의 최대값 로직
		/******************************
	  		
		double tmpSum = 0;
		double maxSumVal = 0;
		for (int i=1; i<n; i++) {
			tmpSum = Math.max(arr[i], tmpSum + arr[i]);
			maxVal = Math.max(maxVal, tmpSum);
			System.out.printf("%.3f\n", maxSumVal);
		}
		  
		 
		 ******************************/

		System.out.printf("%.3f\n", maxVal);

	}
}
