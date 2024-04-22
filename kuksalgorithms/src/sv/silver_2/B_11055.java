package sv.silver_2;

/**
 * 첫째 줄에 수열 A의 크기 n (1<=n<=1000)
 * 둘째 줄에는 수열 A를 이루고 있는 A[i]가 주어진다. (1<=A[i]<=1000)
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11055 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        int[] dp = new int[n];
        String input[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(input[i]);
            dp[i] = array[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + array[i]);
                }
            }
            System.out.println(dp[i]);
        }

        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, dp[i]);
        }

        System.out.println("-------------------------");
        System.out.println(maxSum);
    }
}
