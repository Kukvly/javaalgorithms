package basealgorithms.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class base3_a {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		int t = Integer.parseInt(s);

		int num[][] = new int[t][2];
		int cnt0 = 0;
		int cnt1 = 0;
		
		for (int n = 2; n < t; n++) {
			
			num[0][0] = 1;
			num[0][1] = 0;
			num[1][0] = 0;
			num[1][1] = 1;

			if (n <= 40) {
				if (n == 0) {
					cnt0++;
				} else if (n == 1) {
					cnt1++;
				} else {
//					fibonacci(n);
				}

			}
//			System.out.println(num[i][0] + num[i][1]);
		}

	}

//	public static int fibonacci(int n) {
//		int lst = [(1,0), (0,1)];
//		if (n == 0) {
//			return lst;
//		} else if (n == 1) {
//			return lst;
//		} else {
//			return fibonacci(n - 1) + fibonacci(n - 2);
//		}
//	}

}
