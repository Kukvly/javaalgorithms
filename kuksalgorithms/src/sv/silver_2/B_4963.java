package sv.silver_2;

/**
 * input
 * w h -> 첫째줄
 * h개 줄의 지도 (1=땅, 0=바다)
 * 입력 맨 마지막엔 두 개의 0
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4963 {
	
	static int w,h,cnt;
	
	static int arr[][];
	
	static boolean[][] visited;
	
	
	// 8방
	static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
	static int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	

		while(true) {
			String input[] = br.readLine().split(" ");

			w = Integer.parseInt(input[0]);
			h = Integer.parseInt(input[1]);
						
			if(w==0 && h==0) break;
			
			arr = new int[h][w];
			visited = new boolean[h][w];

			for (int i=0; i<h; i++) {
				input = br.readLine().split(" ");
				for(int j=0; j<w; j++) {
					arr[i][j] = Integer.parseInt(input[j]);
				}
			}
			
			// logic 구현부
			cnt = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if (arr[i][j] == 1 && visited[i][j]==false) {
                        cnt++;
                        dfs(i, j);
                    } 
				}
			}
			
			System.out.println(cnt);
			//
			
		}
		
		
	}
	
	public static void dfs(int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<h && ny<w && arr[nx][ny]==1 && visited[nx][ny]==false) {
				dfs(nx, ny);
			}
		}
	}

}
