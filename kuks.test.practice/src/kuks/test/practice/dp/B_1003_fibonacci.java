package kuks.test.practice.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1003_fibonacci {
    public static int[] zeroCnt, oneCnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        zeroCnt = new int[41];
        oneCnt = new int[41];

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            System.out.println(zeroCnt[n] + " " + oneCnt[n]);
        }
    }

    public static void fibonacci(int n) {
        zeroCnt[0] = 1;
        oneCnt[0] = 0;
        zeroCnt[1] = 0;
        oneCnt[1] = 1;

        for (int i = 2; i <= n; i++) {
            zeroCnt[i] = zeroCnt[i - 1] + zeroCnt[i - 2];
            oneCnt[i] = oneCnt[i - 1] + oneCnt[i - 2];
        }
    }
}