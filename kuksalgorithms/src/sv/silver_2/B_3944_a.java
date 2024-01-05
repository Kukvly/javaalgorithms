package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 
 * @author kukvly
 * 
 *         나머지 계산
 * 
 *         input t: 테스트 케이스의 개수 t개의 (b진법 d) 2<=b<=10 d<=10,000,000
 * 
 *         output t개의 b진법수 d를 (b-1)로 나눈 나머지 출력
 */

public class B_3944_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[] = null;

		int b = 0;
		String d = "";

		while (t-- > 0) {

			input = br.readLine().split(" ");
			b = Integer.parseInt(input[0]);
			d = (input[1]);

			BigInteger changedD = new BigInteger(d, b);
			System.out.println(changedD.mod(BigInteger.valueOf(b - 1)));

		}
	}
}
