package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 *
 */

public class B_11403 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			String input[] = br.readLine().split(" ");
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}

		// logic
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(arr[i][k]==1 && arr[k][j]==1) {
						arr[i][j] = 1;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
				;
			}
			System.out.println();
		}

	}

}