package tested;

import java.util.*;

public class namu_2 {
	static int n, m;
    static int[][] grid;
    static int[][][] dp; // dp[i][j][k]: i번째 친구가 (j, k) 위치에서 시작했을 때의 최대 열매 수확량
    static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // 상하좌우 이동을 위한 방향 배열

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        // 나무의 열매 수확량 정보 입력
        grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        // 각 친구의 시작 위치 입력
        dp = new int[m][n][n];
        int maxFruitsSum = 0;
        for (int i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // 친구의 시작 위치에서 시작하여 최대 열매 수확량 계산
            int maxFruits = dfs(i, x, y, 0);
            maxFruitsSum += maxFruits;
        }
        
        // 결과 출력
        System.out.println(maxFruitsSum);
    }

    // DFS로 최대 열매 수확량 계산
    static int dfs(int friend, int x, int y, int time) {
        // 범위를 벗어난 경우 또는 이미 방문한 칸인 경우
        if (x < 0 || x >= n || y < 0 || y >= n || time >= 3 || dp[friend][x][y] != 0) {
            return 0;
        }

        // 현재 위치의 열매 수확량
        int fruits = grid[x][y];

        // 현재 위치를 방문했다고 표시
        dp[friend][x][y] = 1;

        // 인접한 칸으로 이동하면서 최대 열매 수확량 계산
        int maxFruits = fruits;
        for (int[] dir : dirs) {
            int nextX = x + dir[0];
            int nextY = y + dir[1];
            maxFruits = Math.max(maxFruits, dfs(friend, nextX, nextY, time + 1));
        }
        
        // 현재 위치를 다시 방문하지 않은 상태로 변경
        dp[friend][x][y] = 0;

        return maxFruits;
    }
}