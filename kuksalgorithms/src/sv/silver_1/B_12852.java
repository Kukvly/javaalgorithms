package sv.silver_1;

/**
 *  1. x%3 == 0 -> 3으로 나눔
 *  2. x%2 == 0 -> 2로 나눔
 *  3. 1을 뺀다.
 *  
 *  n이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용하여 1을 만든다.
 *  연산을 사용하는 횟수의 최솟값을 출력하시오.
 *  
 *  input
 *  1 <= n <= 1,000,000
 *  
 *  output
 *  첫째 줄에 연산을 하는 횟수의 최솟값 출력하시오.
 *  둘째 줄에는 n을 1로 만드는 방법에 포함되어 있는 수를 공백으로 구분해서 순서대로 출력한다.
 *  정답이 여러가지인 경우에는 아무거나 출력한다.
 *  
 *  
 *  결론적으로 1로 만들기는 반대로 1에서 n을 만드는데 까지 걸리는 최소 횟수를 구하는 개념이라고
 *  보면 될 것 같다.
 *  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12852 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[n+1];
		int before[] = new int[n+1];
		
		for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;
            before[i] = i - 1;
            
            if (i % 2 == 0 && dp[i] > dp[i / 2] + 1) {
                dp[i] = dp[i / 2] + 1;
                before[i] = i / 2;
            }
            
            if (i%3==0 && dp[i] > dp[i/3] + 1) {
            	dp[i] = dp[i/3] + 1;
            	before[i] = i/3;
            }
		}
		System.out.println("-------------------------");
		for(int j=0; j<before.length; j++) {
			System.out.println(before[j]);
		}
		System.out.println("-------------------------");
		
		System.out.println(dp[n]);
		while(n!=0) {
			System.out.print(n + " ");
			n = before[n];
		}
	}
	
	

}
