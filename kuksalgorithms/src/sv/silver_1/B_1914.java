package sv.silver_1;

/**
 * 세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다.
 * 각 원판은 반경이 큰 순서대로 쌓여있다.
 * 이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.
 * 
 * 1. 한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
 * 2. 쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
 * 
 * 이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라.
 * 단, 이동 횟수는 최소가 되어야 한다.
 * 
 * 아래 그림은 원판이 5개인 경우의 예시이다.
 * 
 * input
 * 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1<=N<=100)이 주어진다.
 * 
 * output
 * 첫째 줄에 옮긴 횟수 K를 출력한다.
 * N이 20 이하인 입력에 대해서는 두 번째 줄부터는 수행 과정을 출력한다.
 * 두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
 * 이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 * N이 20보다 큰 경우에는 과정은 출력할 필요가 없다.
 * 
 * 
 * 장대는 항상 3개
 * 원판만 n개
 * 
 * 하노이탑 움직임 수 = 2^n - 1
 * 
 * BigInteger.ONE: BigInteger 클래스의 상수 1
 * .shiftLeft(n): 비트를 왼쪽으로 n만큼 이동 -> 이 부분은 2의 n승을 의미
 * .subtract(BigInteger.ONE): 2의 n승에서 1을 뺀 값을 계산합니다
 *
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class B_1914 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 2^n - 1이 이동 횟수이므로 BigInteger를 사용
        // 
        BigInteger moves = BigInteger.ONE.shiftLeft(n).subtract(BigInteger.ONE);

        System.out.println(moves);

        if (n <= 20) {
            hanoi(n, 1, 2, 3);
        }
    }

    // 하노이 탑 이동 순서 출력 함수
    private static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            System.out.println(from + " " + to);
        } else {
            hanoi(n - 1, from, to, via);
            System.out.println(from + " " + to);
            hanoi(n - 1, via, from, to);
        }
    }
}