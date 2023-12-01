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

		for (int i = 0; i < n; i++) {
			String row = br.readLine(); 
			for (int j = 0; j < n; j++) {
				if(Character.isDigit(row.charAt(j))) {
					mine[i][j] = (String.valueOf(row.charAt(j)));
				}
				else {
					mine[i][j] = ".";
				}
            }
		}
		
		// logic
		
	}


}