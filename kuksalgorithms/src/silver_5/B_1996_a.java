package silver_5;

/*
 * 아예 출력 자체를 지뢰가 나오면 rst에 하게끔 한다.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B_1996_a {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] mine = new char[n][n];
		char[][] rst = new char[n][n];
		
		System.out.println("rst[0][0]: "+rst[0][0]);
		
		// -1, 0, 1 변화량의 값이 세가지 -> dx, dy의 가짓수: 2^3 = 8
		// dx, dy의 각 순서상에 맞게 초기화
		int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
		int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };
		
		// get input
		for (int i = 0; i < n; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < n; j++) {
				mine[i][j] = tmp.charAt(j);
//				System.out.print(mine[i][j]);	
			}
			
//			System.out.println();	
		}
		
		// Logic
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int cnt = 0;
				if (mine[i][j] != '.') {
					rst[i][j] = '*';
					continue;
				} else
					for (int k = 0; k < 8; k++) {
						if (i + dx[k] < 0 || i + dx[k] >= n || j + dy[k] < 0 || j + dy[k] >= n) {
							continue;
						}
						System.out.println("kuks");
						// 0은 빈칸을 의미함
						if (mine[i + dx[k]][j + dy[k]] > '0') {
							cnt += mine[i + dx[k]][j + dy[k]] - '0';
							System.out.println(i+". ======================");
							System.out.println("mine["+i + " + dx["+k+"]]["+j + " + dy["+k+"]]: " + mine[i + dx[k]][j + dy[k]]);
							System.out.println("kuks cnt chk: " + cnt);
						}
					}
				System.out.println(rst[i][j] + " " + "pomi");
				
				if (cnt < 10) {
					// int cnt = n;
					// (char) (cnt + '0')
					// cnt를 'n'으로 변환
					rst[i][j] = (char) (cnt + '0');
				} else {
					rst[i][j] = 'M';
				}	
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(rst[i]);
		}
	}
}
