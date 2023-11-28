/**
 * 수열의 합
 * N: 합
 * L: 길이가 적어도 L
 * 가장 짧은 연속된 음이 아닌 정수 리스트 출력
 * N <= 1000000000, 2<=L<=100 [N, L 자연수]
 * 만약 리스트의 길이가 100보다 작거나 같으면, 
 * 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다. 
 * 만약 길이가 100보다 크거나 그러한 수열이 없을 때는 -1을 출력한다.
 */

package basealgorithms.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class base7_a {

	public static void main(String[] args) throws IOException {

		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String [] input = buffer.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int l = Integer.parseInt(input[1]);
		
		// l보다는 크고 100보다는 작은 연속합의 최소횟수 체크
		int min = 100;
		
		// n과 비교할 연속합이 저장됨
		int sum = 0;
		
		// sum에 더해지는 횟수를 계산
		int count = 0;
		
		// 배열에 저장될 임시값이 들어갈 변수
		int temp = 0;
		
		// 연속합에 사용되는 숫자가 저장될 변수
		int[] arr = new int[n];
		for (int i = 1; i < n / 2; i++) {

			loop: for (int j = i; j < n / 2; j++) {
				if (sum < n) {
					sum += j;
					count++;
					// n과 같아지기 위해서 지속적으로 sum에 더해줌
					if (sum == n) {
						if (min >= count && count >= l) {
							Arrays.fill(arr, 0);
							// 최솟값을 찾았음으로 배열의 있는 수를 0으로 초기화
							min = count;
							temp = i;
							// 연속합의 초기값 i로 지정
							for (int k = 1; k <= count; k++) {
								arr[k] = temp;
								temp++;
								// count 값 만큼 배열에 저장
							}
						} else {
							break loop;
						}
					}
				} else {
					break loop;
				}
			}
		}

		Arrays.sort(arr);
		// 올림차수 정렬

		if (arr[n - 1] == 0) {
			System.out.println(-1);
			// 연속합이 되는지 여부 체크
			// 연속합이 될경우 마지막에 무조건 0보다 큰 값이들어감
		} else {
			for (int i = 0; i < n; i++) {
				if (arr[i] != 0) {
					System.out.print(arr[i] + " ");
				}
			}
		}

	}

}