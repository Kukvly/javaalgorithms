package gd.gold_4;

import java.io.*;

/**
 * 
 * @author kukvly
 * 
 * N명의 아이들이 임의의 순서로 줄을 서 있을 때,
 * 번호 순서대로 배치하기 위해 옮겨지는 아이의 최소 수를 구하는 프로그램을 작성
 */

public class B_2631 {
	static int dp[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		dp = new int[n];
		
		for(int i=0; i<n; i++) {
			dp[i] = Integer.parseInt(br.readLine());
		}
	}

}
