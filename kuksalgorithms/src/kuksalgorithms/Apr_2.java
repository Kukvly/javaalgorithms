package kuksalgorithms;

import java.util.Scanner;

/**
 * 
 * @author kukvly T: 테스트 케이스의 수 A, B: 정수
 */

public class Apr_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int t = input.nextInt();

		for (int i = 0; i < t; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			int sum[] = new int[t];
			sum[i] = n + k;
			System.out.println(sum[i]);
		}

	}

}
