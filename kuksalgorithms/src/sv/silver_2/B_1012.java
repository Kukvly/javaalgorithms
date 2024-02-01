package sv.silver_2;

/**
 * 
 * @author kukvly 유기농 배추 한 배추의 상하좌우 네 방향에 다른 배추가 위치한 경우 -> 서로 인접해있는 것 T: 테스트 케이스
 *         수 M: 가로 N: 세로 (1<=M,N<=50) K 위치의 개수 K개의 X Y (0<=X<=M-1), (0<=Y<=N-1)
 * 
 *         두 배추의 위치가 같은 경우는 없다.
 */

import java.util.Scanner;

public class B_1012 {
    static int[][] farm;
    static int M, N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            M = sc.nextInt();  // 가로
            N = sc.nextInt();  // 세로
            int K = sc.nextInt();  // 배추 개수
            farm = new int[N][M];

            for (int i = 0; i < K; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                farm[Y][X] = 1;
            }

            int result = countWorms();
            System.out.println(result);
        }
    }

    static void dfs(int x, int y) {
        if (x < 0 || x >= N || y < 0 || y >= M) {
            return;
        }

        if (farm[x][y] == 1) {
            farm[x][y] = 0;

            // 상, 하, 좌, 우 방향으로 DFS 호출
            dfs(x + 1, y);
            dfs(x - 1, y);
            dfs(x, y + 1);
            dfs(x, y - 1);
        }
    }

    static int countWorms() {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (farm[i][j] == 1) {
                    dfs(i, j);
                    count++;
                }
            }
        }
        return count;
    }
}