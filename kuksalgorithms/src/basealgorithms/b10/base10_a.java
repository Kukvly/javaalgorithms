package basealgorithms.b10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class base10_a {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(buffer.readLine());
		int[] arr = new int[n];
		int[] sortedArr = new int[n];

		StringTokenizer st = new StringTokenizer(buffer.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sortedArr[i] = arr[i];
		}

		Arrays.sort(sortedArr); // 수열을 정렬합니다.

		int[] result = new int[n];
		boolean[] used = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] == sortedArr[j] && !used[j]) {
					result[i] = j;
					used[j] = true;
					break;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}