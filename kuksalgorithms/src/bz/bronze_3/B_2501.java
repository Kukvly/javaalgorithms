package bz.bronze_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author YunKukKim �ƿ� �𸣴� ����
 *
 */

public class B_2501 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);

		int tmp = 0;

		int cnt = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				cnt++;
				if (cnt == k) {
					tmp = i;
					break;
				}
			}
		}
		
		if (cnt < k) {
			System.out.println(0);
			return;
		} else {
			System.out.println(tmp);
			return;
		}

	}

}
