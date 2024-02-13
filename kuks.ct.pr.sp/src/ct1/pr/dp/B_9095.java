package ct1.pr.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly 4 -> 1, 2, 3의 합으로 나타내려면~
 * 
 *         결국 n을 입력 받았을 때, 1, 2, 3의 합으로 나타내는 문제 t개의 n을 입력값으로 받는다.
 */

// silver3

public class B_9095 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());

			// logic part
			System.out.println(cal(n));
		}

	}

	public static int cal(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 2;
		} else if (n == 3) {
			return 4;
		} else {
			int arr[] = new int[n + 1];
			arr[1] = 1;
			arr[2] = 2;
			arr[3] = 4;

			for (int i = 4; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
			}

			return arr[n];

		}
	}
}
