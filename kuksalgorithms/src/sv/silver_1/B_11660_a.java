package sv.silver_1;

/**
 * 1<=n<=1024
 * 1<=n<=100000
 * 
 * ��° �ٺ��� n���� �ٿ��� ǥ�� ä���� �ִ� ���� ���ʴ�� 1����� �־��� ��
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11660_a {
	
	static int arr[][], sum[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // ǥ�� ũ��
		int m = Integer.parseInt(input[1]); // ���ؾ��ϴ� Ƚ�� 
		
		arr = new int [n+1][n+1];
		sum = new int [n+1][n+1];
		
		for (int i=1; i<=n; i++) {
			input = br.readLine().split(" ");
			for (int j=1; j<=n; j++) {
				arr[i][j] = Integer.parseInt(input[j-1]);
				
				// ���� �� �迭
				sum[i][j] = arr[i][j] + sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1];
			}
		}
		
		for (int i=0; i<m; i++) {
			input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			
			int rtn = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
			System.out.println(rtn);
		}
		
	}

}
