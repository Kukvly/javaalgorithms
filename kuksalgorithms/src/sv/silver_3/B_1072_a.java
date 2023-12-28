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

public class B_1072_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long x = Long.parseLong(input[0]);
		long y = Long.parseLong(input[1]);

		long z = (long) ((y * 100) / x);

		if(z>=99) {
			System.out.println(-1);
		} else {
			long low = 0;
			long high = 1000000000;
			long rtn = -1;
			
			while(low<=high) {
				long n = (low + high)/2;
				long _x = x + n;
				long _y = y + n;
				
				long _z = (_y*100) / _x;
				
				if(z < _z) {
					high = n - 1;
					rtn = n;
				} else {
					low = n + 1;
				}
			}
			

			System.out.println(rtn);
		}
	}
}
