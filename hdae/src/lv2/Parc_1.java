package lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Parc_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
	
		int arr[][] = new int [n+1][m+1];
		
		int kuks = 0;
		
		for(int i=1; i<=n; i++) {
			input = br.readLine().split(" ");
			for(int j=1; j<=m; j++) {
				arr[i][j] = Integer.parseInt(input[j-1]);
				if(arr[i][j]==1) {
					kuks++;
				}
			}
		}

		for(int t=1; t<=2; t++) {
			input = br.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			int attack [][] = new int [n+1][m+1];
			for(int i=start; i<=end; i++) {
				attack[i][1]=1;
			}
		
			for(int j=1; j<=m; j++) {
				for(int i=start; i<=end; i++) {
					if(arr[i][j]==1 && attack[i][j]==1) {
						arr[i][j] = 0;
						attack[i][j]=0;
						
						kuks--;
					} else {
						if(j<m) {
							attack[i][j+1] = attack[i][j];
						}
						
					}
				}
			}
		}
		
		System.out.println(kuks);
	}

}
