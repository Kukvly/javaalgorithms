package sv.silver_1;

/**
 * n: 집의 수
 * 집은 R, G, B 중 하나의 색으로 칠한다.
 * 1번 집의 색은 2번 집의 색과 달라야 함
 * n번 집의 색은 n-1번 집의 색과 달라야 함
 * i (2<=i<=n-1)번 집의 색은 i-1번, i+1번 집의 색과 달라야 함
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1149 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		int cost[][] = new int [n][3];
		
		for (int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			for (int j=0; j<3; j++) {
				cost[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		
	}

}
