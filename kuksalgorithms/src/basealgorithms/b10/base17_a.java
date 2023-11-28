package basealgorithms.b10;

/*
 * [10816]
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다.
 * 정수 M개가 주어졌을 때, 이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.
 * 
 * (숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.)
 * 첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다.
 * 둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다.
 * 셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다.
 * 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수
 * M > N
 * 
 * ex.
 * input 
 * 10
 * 6 3 2 10 10 10 -10 -10 7 3
 * 8
 * 10 9 -5 2 3 4 5 -10
 * 
 * output
 * 3 0 0 1 2 0 0 2
 * 10 3개
 * 9 0개
 * -5 0개
 * 2 1개
 * 3 2개
 * 4 0개
 * 5 0개
 * -10 2개
 * 
 * 
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class base17_a {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 카드의 개수를 입력 받음
        int n = Integer.parseInt(buffer.readLine());

        // 숫자 카드에 적힌 숫자들을 배열에 저장
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(buffer.readLine(), " ");
        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 각 숫자의 개수를 세기 위한 HashMap 생성
        HashMap<Integer, Integer> cardCount = new HashMap<>();

        // HashMap을 이용하여 각 숫자의 개수 세기
        for (int card : cards) {
            // getOrDefault를 사용하여 해당 숫자의 개수를 가져오고, 없으면 0으로 초기화
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        // 정답 출력
        int m = Integer.parseInt(buffer.readLine()); // 찾을 숫자의 개수
        st = new StringTokenizer(buffer.readLine(), " ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int count = cardCount.getOrDefault(target, 0);
            result.append(count).append(" ");
        }

        System.out.println(result.toString());
    }
}