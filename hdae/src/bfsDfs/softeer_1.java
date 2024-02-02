package bfsDfs;

import java.util.Scanner;

public class softeer_1 {
	    static int n, m;
	    static int[][] harvest;
	    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	    static int maxHarvest = 0;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 입력 받기
	        n = scanner.nextInt();
	        m = scanner.nextInt();
	        harvest = new int[n][n];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                harvest[i][j] = scanner.nextInt();
	            }
	        }
	

	        // 각 친구의 시작 위치에서 출발
	        for (int i = 0; i < m; i++) {
	            int startX = scanner.nextInt();
	            int startY = scanner.nextInt();

	            // DFS로 열매 수확량 계산
	            dfs(startX, startY, 0, 3);

	        }

	        System.out.println(maxHarvest);
	    }

	    private static void dfs(int x, int y, int time, int remainingTime) {
	        // 기저 조건: 3초가 지났을 때
	        if (remainingTime == 0) {
	            maxHarvest = Math.max(maxHarvest, harvest[x][y]);
	            return;
	        }

	        // 현재 위치의 열매 수확
	        maxHarvest = Math.max(maxHarvest, harvest[x][y]);

	        // 상하좌우 이동
	        for (int[] dir : dirs) {
	            int nx = x + dir[0];
	            int ny = y + dir[1];

	            // 유효한 위치인지 확인
	            if (isValid(nx, ny)) {
	                // 다음 위치로 이동하며 시간과 남은 시간 갱신
	                dfs(nx, ny, time + 1, remainingTime - 1);
	            }
	        }
	    }

	    private static boolean isValid(int x, int y) {
	        return x >= 0 && x < n && y >= 0 && y < n;
	    }
	}
