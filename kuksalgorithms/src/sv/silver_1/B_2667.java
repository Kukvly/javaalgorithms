package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B_2667 {
	
	static int n,cnt;
	static int arr[][];
	static boolean visited[][];
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static List<Integer> kuksList;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int [n][n];
		visited  = new boolean [n][n];
		
		kuksList = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			String input[] = br.readLine().split("");
			for(int j =0; j<n; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i][j]==1 && !visited[i][j]) {
					bfs(i,j);
				}
			}
		}
		int l = kuksList.size();
		System.out.println(l);
		Collections.sort(kuksList);
		for(int i=0; i<l; i++) {
			System.out.println(kuksList.get(i));
		}
	}
	
	static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x,y});
		visited[x][y] = true;
		int size = 0;
		while(!q.isEmpty()) {
			int current[] = q.poll();
			int cx = current[0];
			int cy = current[1];
			size++;
			for(int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if(nx>=0 && nx <n && ny>=0 && ny <n && arr[nx][ny]==1 && !visited[nx][ny]) {
					q.offer(new int[] {nx,ny});
					visited[nx][ny] = true;
					arr[nx][ny] = arr[cx][cy] + 1;

				}
			}
		}
		
		kuksList.add(size);
		
	}

}
