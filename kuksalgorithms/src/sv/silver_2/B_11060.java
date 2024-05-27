package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_11060 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int [n];
		int dp[] = new int[n];
		String input[] = br.readLine().split(" ");

		// n = 10
		for (int i=0; i<n; i++) {
			// 1 2 0 1 3 2 1 5 4 2
			arr[i] = Integer.parseInt(input[i]);
		}

		Arrays.fill(dp, 1000);

        dp[0] = 0;

        // 핵심 로직
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                if (i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                }
            }
        }
        //
        
        if (dp[n - 1] == 1000) {
            System.out.println(-1);
        } else {
            System.out.println(dp[n - 1]);
        }
    }
}
