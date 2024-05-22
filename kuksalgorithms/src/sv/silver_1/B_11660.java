package sv.silver_1;

/**
 * 1<=n<=1024
 * 1<=n<=100000
 * 
 * ��° �ٺ��� n���� �ٿ��� ǥ�� ä���� �ִ� ���� ���ʴ�� 1����� �־��� ��
 * 
 * Ÿ�� ����
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11660 {
	
	static int arr[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // ǥ�� ũ��
		int m = Integer.parseInt(input[1]); // ���ؾ��ϴ� Ƚ�� 
		
		arr = new int [n][n];
		
		for (int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			for (int j=0; j<n; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for (int i=0; i<m; i++) {
			input = br.readLine().split(" ");
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
			
			int sum = 0;
			
			for(int j=x1-1; j<x2;j++) {
				for (int k=y1-1; k<y2; k++) {
					sum += arr[j][k];
				}
			}
			
			System.out.println(sum);
		}
		
	}

}