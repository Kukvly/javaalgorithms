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
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12852 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int dp;
		
		while(n>1) {
			cnt++;
			if(n%3==0) {
				n = n/3;
			} else if(n%2==0) {
				n = n/2;
			} else {
				n--;
			}	
		}
			
		
		
	}

}
