package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_1446 {
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String input[] = br.readLine().split(" ");
		
		// 1<=n<=12
		int n = Integer.parseInt(input[0]);
		
		// 1<=n<=10000
		int d = Integer.parseInt(input[1]);
		
//		arr[i][0]: 지름길 시작위치
//		arr[i][1]: 지름길 도착위치
//		arr[i][2]: 지름길 길이
		
		int arr[][] = new int [n][3];

		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			for(int j=0; j<3; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		// 도착지점 d까지의 거리 배열
		int dp[]= new int [d+1];
		
		for(int i=0; i<=d; i++) {
			dp[i] = i;
		}
		
		for(int i=0; i<=d; i++) {
			if(i>0) {
				dp[i] = Math.min(dp[i], dp[i-1]+1);
			}
			for(int j=0; j<n; j++) {
				if(arr[j][0] == i && arr[j][1] <= d) {
					dp[arr[j][1]] = Math.min(dp[arr[j][1]], dp[arr[j][0]] + arr[j][2]);
				}
			}
		}
		
		System.out.println(dp[d]);
	}

}
