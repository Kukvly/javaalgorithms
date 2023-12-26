package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * 합이 n이면서, 길이가 적어도 l인 가장 짧은 연속된 음이 아닌 정수 리스트 구하기
 * 
 * input
 * N <= 1,000,000,000인 자연수
 * 2<=L<=100인 자연수
 * 
 * output
 * 리스트 길이 <= 100이면, 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다.
 * 만약 길이가 100보다 크거나 그러한 수열이 없을 경우에는 -1을 출력한다.
 * 
 * 		// 홀
		i i+1 i+2 -> 3개 3*(i+1) = n이어야함
		5 6 7
		3*(5+1) = 18
		
		56789
		5*(5+2) = 35
		
		l*(i+i) = n
		
		
		
		// 짝
//		n n+1 n+2 n+3
		n
 *
 */



public class B_1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String[] input = buffer.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int l = Integer.parseInt(input[1]);

		for (int length = l; length <= 100; length++) {
			// 등차수열의 합 공식을 이용하여 연속된 수열의 합 계산
			int sum = (length * (length - 1)) / 2;

			// 수열의 첫 항 구하기
			int first = (n - sum) / length;

			// 수열의 첫 항이 음수거나 수열의 합이 N과 같은 경우
			if (first < 0)
				break;

			// 수열의 합이 N과 같으면 출력
			if (n == sum + (length * first)) {
				for (int i = 0; i < length; i++) {
					System.out.print((first + i) + " ");
				}
				return;
			}
		}

		System.out.println(-1); // 조건을 만족하는 수열을 찾을 수 없을 경우 -1 출력
	}
}
