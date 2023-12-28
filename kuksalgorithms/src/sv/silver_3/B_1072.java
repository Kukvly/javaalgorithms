package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * 게임 횟수: x 이긴 게임: y (z%) z: 승률 (소수점 버림)
 * ex. x=53, y=47이면 z=88
 * x와 y가 주어질 때 게임을 최소 몇 번을 더해야 z가 변하는지 구하는 프로그램을 작성하시오.
 * 1 <= x <= 1,000,000,000
 * 0 <= y <= x
 * 
 *
 */

public class B_1072 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int x = Integer.parseInt(input[0]);
		int y = Integer.parseInt(input[1]);
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}

}
