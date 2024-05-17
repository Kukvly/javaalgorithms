package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9507 {
	static long arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			arr = new long[n + 1];

			if (n >= 0) {
				arr[0] = 1;
			}
			if (n >= 1) {
				arr[1] = 1;
			}
			if (n >= 2) {
				arr[2] = 2;
			}
			if (n >= 3) {
				arr[3] = 4;
			}

			if (n >= 4) {
				for (int j = 4; j <= n; j++) {
					arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3] + arr[j - 4];
				}
			}

			System.out.println(arr[n]);

		}
	}
}
