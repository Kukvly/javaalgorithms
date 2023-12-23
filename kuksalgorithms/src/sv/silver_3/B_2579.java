package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly 1. 계단은 1회에 1개/2개 씩 오를 수 있다. 2. 연속된 3개의 계단을 모두 밟을 수 없다. (단,
 *         시작점은 계단에서 제외) 3. 마지막 도착 계단은 반드시 밟아야 한다.
 * 
 *         input 계단의 수 6 계단의 수 만큼의 각 계단의 점수들 10 20 15 25 10 20
 * 
 *         1<= 계단 개수 <= 300 1<= 계단에 쓰여 있는 점수 <= 10000
 * 
 *         output 계단 오르기 게임에서 얻을 수 있는 총 점수의 최댓값
 */

public class B_2579 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int st[] = new int[n + 1];
		int score[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			st[i] = Integer.parseInt(br.readLine());
		}
		if (n == 1) {
			System.out.println(st[1]);
			return;
		}
		score[1] = st[1];
		score[2] = st[1]+st[2];
		
		for (int i = 3; i <= n; i++) {
			// rtn3=rtn1+st3, rtn0+st2+st3
			// rtn4=rtn2+st4, rtn1+st3+st4
			// rtn5=rtn3+st5. rtn2+st4+st5
			// rtn6=rtn4+st6, rtn3+st5+st6
			score[i] = Math.max((score[i - 2] + st[i]), (score[i - 3] + st[i - 1] + st[i]));

		}
		System.out.println("---------------------------------");
		System.out.println(score[n]);
		System.out.println("---------------------------------");
	}

}
