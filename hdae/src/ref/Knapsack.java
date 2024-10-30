package ref;

import java.io.*;
import java.util.*;

/**
 * 
 * @author kukvly
 * 기출 추정 문제 -> 기억력에 의거하여 풀어봄
 * 
 *
 */

public class Knapsack{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int t = Integer.parseInt(input[0]);
		int n = Integer.parseInt(input[1]); // 물건 개수
		int k = Integer.parseInt(input[2]); // 무게

		int w[] = new int[n + 1]; // 무게
		int v[] = new int[n + 1]; // 가중치

		int dp[][] = new int[n + 1][k + 1]; // i에는 무게를 j에는 가중치를

		for (int i = 1; i <= n; i++) {
			input = br.readLine().split(" ");
			w[i] = Integer.parseInt(input[0]);
			v[i] = Integer.parseInt(input[1]);
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= k; j++) {
				if (w[i] <= j) {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		
		ArrayList<Integer> rtn = new ArrayList<>();
		
		for(int i=0; i<=k; i++) {
			rtn.add(dp[n][i]);
		}
		
		Collections.sort(rtn, Collections.reverseOrder());
		
		for(int i=0; i<t && i < rtn.size(); i++) {
			System.out.print(rtn.get(i) + " ");
		}
	}

}