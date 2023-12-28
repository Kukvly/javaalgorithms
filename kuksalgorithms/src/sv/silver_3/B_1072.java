package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 *         게임 횟수: x 이긴 게임: y (z%) z: 승률 (소수점 버림) ex. x=53, y=47이면 z=88 x와 y가 주어질
 *         때 게임을 최소 몇 번을 더해야 z가 변하는지 구하는 프로그램을 작성하시오. 1 <= x <= 1,000,000,000 0
 *         <= y <= x
 * 
 *
 */

public class B_1072 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long x = Long.parseLong(input[0]);
		long y = Long.parseLong(input[1]);

		long z = (long) ((y / x) * 100);
		long compareZ = 0;

		long MAX_NUM = Long.MAX_VALUE;

		for (long i = 0; i <= (MAX_NUM-x); i++) {
			compareZ = (long) (((y + i) / (x + i)) * 100);
			if(z>=99) {
				// x==y
				System.out.println("-1");
				return;
			} else if (z < compareZ) {
				System.out.println(i);
				return;
			}
		}
	}

}
