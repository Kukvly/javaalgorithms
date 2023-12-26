package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());

		System.out.println(Cal(x, 0));
	}

	public static int Cal(int n, int cnt) {
		while (n > 1) {
			if ((n - 1) % 3 == 0) {
				n = n - 1;
				cnt++;
			} else if (n % 3 == 0) {
				n = n / 3;
				cnt++;
			} else if (n % 2 == 0) {
				n = n / 2;
				cnt++;
			} else {
				n = n - 1;
				cnt++;
			}

			if (n == 1) {
//				return cnt;
				break;
			}

//			System.out.println(n);
			Cal(n, cnt);

		}

		return cnt;
	}

}
