package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_1018 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		char[][] chess = new char[n][m];
		
		for (int i=0; i<m; i++) {
			input[i] = br.readLine();
			chess[i]= input[i].toCharArray();
		}
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<m; i++) {
				System.out.println(chess[i][j]);
			}
		}
		
		
		
		
	}

}
