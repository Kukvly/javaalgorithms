package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2563 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int[100][100];
		
		int rtn=0;
		
		for(int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(arr[j][k]==0) {
						arr[j][k] = 1;
						rtn++;
					}
				}
			}
		}
		
		System.out.print(rtn);
	}

}
