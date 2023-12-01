package silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1996 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String mine[][] = new String[n][n];
		String rst[][] = new String[n][n];

		// input
		for (int i = 0; i < n; i++) {
			String row = br.readLine();
			for (int j = 0; j < n; j++) {
				rst[i][j] = "0";
				if (Character.isDigit(row.charAt(j))) {
					mine[i][j] = (String.valueOf(row.charAt(j)));
				} else {
					mine[i][j] = ".";
				}
			}

		}

		// 1 x 1
		if (n == 1) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					} else {
						rst[i][j] = mine[i][j];

					}
					System.out.print(rst[i][j]);

				}
				System.out.println();
			}

		}

		// 2 x 2
		int sum2 = 0;
		if (n == 2) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
						sum2 += Integer.parseInt(mine[i][j]);
					}

					else {
						rst[i][j] = rst[i][j];
					}
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					}

					else {
						rst[i][j] = String.valueOf(sum2);
					}

					System.out.print(rst[i][j]);
				}
				System.out.println("");
			}
		}
		
		// logic (n x n)
		if (n > 2) {	
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (Character.isDigit(mine[i][j].charAt(0))) {
						rst[i][j] = "*";
					} else {
						rst[i][j] = mine[i][j];

					}
					System.out.print(rst[i][j]);

				}
				System.out.println();
			}
		}
	}
}