package lv3;

/**
 * # 이 문제의 성격은 DFS/greedy
 * 
 * 1. 배열 내 탐색시에는 dx, dy로 좌표 변화 초기화
 * 2. 탐색시 boolean visited[][] 필수 -> 방문 여부를 알아야 하니까
 * 3. 무작정 탐색 x -> 내가 첨에 구현하려고 한 방향이 브루트포스
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prac_1 {
    
    // 상하좌우 이동을 위한 좌표 변화
    static int[] dx = {-1, 1, 0, 0}; // 위, 아래, 왼쪽, 오른쪽
    static int[] dy = {0, 0, -1, 1};
    static int n, m, fruits = 0;
    static int arr[][];
    static int friends[][];
    static boolean visited[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); // 배열 크기
        m = Integer.parseInt(input[1]); // 친구 수

        arr = new int[n + 1][n + 1]; // 열매 수 정보
        visited = new boolean[n + 1][n + 1]; // 중복 수확 방지
        friends = new int[m][2]; // 친구들의 시작 위치

        // 열매 정보 입력
        for (int i = 1; i <= n; i++) {
            input = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(input[j - 1]);
            }
        }

        // 친구별 수확 작업 처리
        for (int t = 0; t < m; t++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]); // 시작 좌표 x
            int y = Integer.parseInt(input[1]); // 시작 좌표 y

            friends[t][0] = x;
            friends[t][1] = y;
            
            
            // 현재 위치에서 열매 수확
            fruits += arr[x][y];
            visited[x][y] = true;

        }
        // 첫 번째 친구부터 수확 시작 (DFS)
        dfs(friends[0][0], friends[0][1], 0, 0, fruits);
            
     // 최종 수확량 출력
        System.out.println(fruits);
    }
    
    public static void dfs(int x, int y, int fCnt, int time, int sum) {
    	fruits = Math.max(fruits, sum);
    	
    	// 한 친구가 세 번 이동을 하면 다음 친구로 이동
    	if(time==3) {
    		if(fCnt + 1 < m) {
    			dfs(friends[fCnt+1][0], friends[fCnt+1][1], fCnt+1, 0, sum);
    		}
    	} else {
    		for(int i=0; i<4; i++) {
    			int nx = x + dx[i];
    			int ny = y + dy[i];
    			
    			// 배열 범위 내에 있고 아직 방문하지 않았다면
    			if(nx>0 && nx<=n && ny>0 && ny<= n && !visited[nx][ny]) {
    				visited[nx][ny] = true;
    				dfs(nx, ny, fCnt, time+1, sum+arr[nx][ny]);
    				visited[nx][ny] = false;
    			}
    		}
    	}
    }

    
}
