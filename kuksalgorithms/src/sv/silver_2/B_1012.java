package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 유기농 배추
 * 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우 -> 서로 인접해있는 것
 * T: 테스트 케이스 수
 * M: 가로
 * N: 세로
 * (1<=M,N<=50)
 * K 위치의 개수
 * K개의 X Y (0<=X<=M-1), (0<=Y<=N-1)
 * 
 * 두 배추의 위치가 같은 경우는 없다.
 */

public class B_1012 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
		for(int i=0;i<t;i++) {
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			int k = Integer.parseInt(input[2]);
			
			int vegArr[][] = new int[m][n];
			
			for (int j=0; j<k; j++) {
				input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				vegArr[x][y] = 1;
			}
		}
		
	}

}
