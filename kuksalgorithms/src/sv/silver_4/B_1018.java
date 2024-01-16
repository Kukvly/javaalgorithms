package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author kukvly n x m -> n행 m열
 * 
 * 
 * 
 */

public class B_1018 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		char[][] chess = new char[n][m];

		char[][] tmpArr = new char[n][m];

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < m; j++) {
				input = br.readLine().split("");
				input[i] = br.readLine();
				tmpArr[i][j] = input[i].toCharArray()[j];
			}
		}

		System.out.println(tmpArr.length + "===============");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.println(tmpArr[i][j]);
			}
		}

		System.out.println("=================");

	}

}
