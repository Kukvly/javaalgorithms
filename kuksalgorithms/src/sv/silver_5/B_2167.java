package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2167 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int arr[][] = new int[n][m];
	
		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		int k = Integer.parseInt(br.readLine());
		
		
		for(int a=0; a<k; a++) {
			input = br.readLine().split(" ");
			int sum = 0;
			int i = Integer.parseInt(input[0])-1;
			int j = Integer.parseInt(input[1])-1;
			int x = Integer.parseInt(input[2])-1;
			int y = Integer.parseInt(input[3])-1;
			for (int b=i; b<=x; b++) {
				for(int c=j; c<=y; c++) {
					sum += arr[b][c];
				}
			}
			System.out.println(sum);
		}
	}

}
