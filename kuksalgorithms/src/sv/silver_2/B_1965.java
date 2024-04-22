package sv.silver_2;

// 가장 긴 증가하는 부분 수열
// 비슷한 문제로 B_11053이 있음

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1965 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int box[] = new int[n];
		int dp[] = new int[n];
		String input[] = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			box[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.fill(dp, 1);
		int tmp = 0;
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(box[i] > box[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
					System.out.println("in_i[" + i + "]: " + dp[i]);
				}

				System.out.println("### out_i[" + i + "]: " + dp[i]);
			}
			tmp = Math.max(dp[i], tmp);
		}
		
		System.out.println(tmp);
	}

}