package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly 유기농 배추 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우 -> 서로 인접해있는 것 T: 테스트 케이스
 *         수 M: 가로 N: 세로 (1<=M,N<=50) K 위치의 개수 K개의 X Y (0<=X<=M-1), (0<=Y<=N-1)
 * 
 *         두 배추의 위치가 같은 경우는 없다.
 */

public class B_1012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");

		for (int i = 0; i < t; i++) {
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			int k = Integer.parseInt(input[2]);

			int vegArr[][] = new int[m][n];
			int cnt = 0;

			for (int j = 0; j < k; j++) {
				input = br.readLine().split(" ");
				int x = Integer.parseInt(input[0]);
				int y = Integer.parseInt(input[1]);
				vegArr[x][y] =1;
			}
				
			for (int x=0; x<m; x++) {
				for(int y=0; y<n; y++) {
					System.out.print(vegArr[x][y] + " ");
				}
				System.out.println("");
			}
			
			/*
			 * 일단 제일 먼저 각 행마다 x=1이 어디서 나오는지를 저장한다.
			 * 
			 * 
			 * 
			 * 
			 * 
			 * */
			
				/**
				 * 1,1 1,2, 2,1 -> 1개만 있어도 1섹터 (1마리)
				 * 
				 * 2,2 -> 1마리 or 2마리 -> x x+1 y y+1 
				 * if((x,y)==1 && (x+1,y+1)==1) or if((x+1,y)==1 && (x.y+1)==1)
				 * 
				 * 3,1 -> 가운데만 있으면 1개(=3개다있어도 1개) 양끝에 하나씩이면 2개 
				 * 
				 * 
				 * 밑에줄부터 탐색을 시작한다.
				 * 0행부터 시작해서 1이 나온 부분 idx 저장
				 * vegArr[x][y]==1
				 * 
				 */
/*
			for(int x=0; x<m; x++) {
				for(int y=0; y<n; y++) {
					// 탐색이 필요할 것 같
					if (k == 1) {
						System.out.println(1);
					} else {
						// 꼭짓점
						// logic1 -> 다 else if 로 바꿀것
						if ((x == 0 && y == 0)) { // (0,0)
							if(vegArr[x+1][y]==1 || vegArr[x][y+1]==1) {
								cnt++;
							}
						} else if ((x == (m - 1) && y == (n - 1))) { // (m-1,n-1)
							if(vegArr[x-1][y]==1 || vegArr[x][y-1]==1) {
								cnt++;
							}
						} else if ((x == (m - 1) && y == 0)) { // (m-1, 0)
							if(vegArr[x-1][y]==1 || vegArr[x][y+1]==1) {
								cnt++;
							}
						} else if (x == 0 && y == (n - 1)) { // (0, n-1)
							if(vegArr[x+1][y]==1 || vegArr[x][y-1]==1) {
								cnt++;
							}
						} else if((0<x) && (x<m-1)) {
							if(x==)
						} 
						else if ((0<y) && (y>n-1)) { // 모서리
						
							
						} else { // 일반식
							
						}
				}
		}
*/
		}
	}

}
