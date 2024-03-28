package sv.silver_3;

/**
 * 다이나믹 프로그래밍
 * 14501 퇴사
 * 
 * n+1일째 되는 날 퇴사를 하기 위해서, 남은 n일 동안 최대한 많은 상담을 하려 한다.
 * 
 * <n=7일 때의 상담표>
 * 		1일		2일		3일		4일		5일		6일		7일
 * Ti	3		5		1		1		2		4		2
 * Pi	10		20		10		20		15		40		200
 * 
 * ex.
 * 1일에 잡힌 상담 소요시간 -> 3일
 * 1일에 잡힌 상담 완료페이 -> 10
 * 
 * 5일에 잡힌 상담 소요시간 -> 2일
 * 5일에 잡힌 상담 완료페이 -> 15
 * 
 * 상담을 하는데 필요한 기간은 1일보다 클 수 있어서 n일의 상담을 다 못할 수도 있다.
 * 
 * 상담을 적절히 했을 때의 최대 수익
 * 즉, Pi가 최대가 될 때의 Ti를 같이 구해준다.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14501 {
	public static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		int t[] = new int[n+1];
		int p[] = new int[n+1];
		int dp[] = new int[n+2];
		
		for (int i=1; i<=n; i++) {
			String input[] = br.readLine().split(" ");			
			t[i] = Integer.parseInt(input[0]);
			p[i] = Integer.parseInt(input[1]);
		}
		
		for (int i=n; i>=1; i--) {
			int next = i + t[i];
			if(next <= n+1) {
				dp[i] = Math.max(p[i]+dp[next],dp[i+1]);
			}else {
				dp[i] = dp[i+1];
			}
		}
		System.out.println(dp[1]);	
	}
}

/*
 * p[i] + dp[next]는 현재 상담을 선택했을 때 얻을 수 있는 이익(p[i])과 
 * 다음 상담이 끝난 후에 얻을 수 있는 최대 이익(dp[next])을 합한 값이다. 
 * 
 * 만약 다음 상담이 불가능하거나, 현재 상담을 선택하지 않는 것이 더 이익이라면
 * (dp[next] <= dp[i + 1]), 현재 상담을 선택하지 않고 다음 상담을 선택한다
 * */