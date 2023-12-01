package silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1996_a {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] mine = new char[n][n];
        int[][] result = new int[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            mine[i] = br.readLine().toCharArray();
        }

        // 각 위치에 대해 지뢰의 개수 계산
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mine[i][j] == '*') {
                    // 현재 위치가 지뢰라면 그대로 출력
                    System.out.print("*");
                } else {
                    // 현재 위치가 지뢰가 아니라면 주변 8방향에 지뢰 개수 계산
                    result[i][j] = countMines(mine, n, i, j);
                    System.out.print(result[i][j]);
                }
            }
            System.out.println();
        }
    }

    // 현재 위치 기준으로 주변 8방향에 있는 지뢰 개수 계산
    private static int countMines(char[][] mine, int n, int x, int y) {
        int count = 0;

        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int nx = x + i;
                int ny = y + j;

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && mine[nx][ny] == '*') {
                    count++;
                }
            }
        }

        return count;
    }
}