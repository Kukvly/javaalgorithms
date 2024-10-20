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
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        n = Integer.parseInt(input[0]); // 배열 크기
        int m = Integer.parseInt(input[1]); // 친구 수

        int[][] arr = new int[n + 1][n + 1]; // 열매 수 정보
        boolean[][] visited = new boolean[n + 1][n + 1]; // 중복 수확 방지

        int fruits = 0; // 열매 총 수확량

        // 열매 정보 입력
        for (int i = 1; i <= n; i++) {
            input = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(input[j - 1]);
            }
        }

        // 친구별 수확 작업 처리
        for (int t = 1; t <= m; t++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]); // 시작 좌표 x
            int y = Integer.parseInt(input[1]); // 시작 좌표 y

            // 현재 위치에서 열매 수확
            fruits += arr[x][y];
            visited[x][y] = true;

            // 가장 큰 열매로 이동하여 수확
            while (true) {
                int maxFruit = 0;
                int nextX = -1, nextY = -1;

                // 상하좌우에서 가장 큰 열매가 있는 곳을 찾음
                for (int d = 0; d < 4; d++) {
                    int nx = x + dx[d];
                    int ny = y + dy[d];

                    if (isInArr(nx, ny) && !visited[nx][ny] && arr[nx][ny] > maxFruit) {
                        maxFruit = arr[nx][ny];
                        nextX = nx;
                        nextY = ny;
                    }
                }

                // 더 이상 수확할 곳이 없으면 종료
                if (nextX == -1 && nextY == -1) {
                    break;
                }

                // 다음 위치로 이동하여 열매 수확
                x = nextX;
                y = nextY;
                fruits += arr[x][y];
                visited[x][y] = true;
            }
        }

        // 최종 수확량 출력
        System.out.println(fruits);
    }

    // 배열 범위 내에 있는지 확인하는 함수
    static boolean isInArr(int x, int y) {
        return x >= 1 && x <= n && y >= 1 && y <= n;
    }
}
