package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bruteForce {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] size = br.readLine().split(" ");
        int N = Integer.parseInt(size[0]);
        int M = Integer.parseInt(size[1]);

        char[][] board = new char[N][M];

        // 체스판 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        int result = solve(board);
        System.out.println(result);
    }

    private static int solve(char[][] board) {
        int minCount = Integer.MAX_VALUE;

        // 시작점을 (i, j)로 설정하여 8x8 체스판 확인
        for (int i = 0; i <= board.length - 8; i++) {
            for (int j = 0; j <= board[0].length - 8; j++) {
                int count = countChanges(board, i, j);
                minCount = Math.min(minCount, count);
            }
        }

        return minCount;
    }

    private static int countChanges(char[][] board, int startX, int startY) {
        char[] pattern1 = {'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'};
        char[] pattern2 = {'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'};

        int count1 = 0;
        int count2 = 0;

        // (startX, startY)를 시작으로 8x8 체스판 확인
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[startX + i][startY + j] != pattern1[j]) {
                    count1++;
                }
                if (board[startX + i][startY + j] != pattern2[j]) {
                    count2++;
                }
            }
        }

        // pattern1으로 시작했을 때와 pattern2로 시작했을 때 중 작은 값 반환
        return Math.min(count1, count2);
    }
}