package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class B_3944 {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	String input[] = null;

		while (t-- > 0) {
			input = br.readLine().split(" ");
			int b = Integer.parseInt(input[0]);
			String d = (input[1]);

			int remainder = 0;
			System.out.println("");

			// B진법 수를 10진법으로 변환하지 않고도 효과적으로 (B-1)로 나눈 나머지를 계산하는 방법 
			for (int i = 0; i < d.length(); i++) {
				remainder = (remainder * b + (d.charAt(i) - '0')) % (b - 1);
				System.out.println("kuks chk----------------------");
				System.out.println("d: " + d);
				System.out.println("d.charAt("+i+"): " + d.charAt(i));
				System.out.println("d.charAt("+i+"): " + (d.charAt(i)-'0'));
				System.out.println("kuks end----------------------");
			}

			System.out.println(remainder);
		}
	}
}
