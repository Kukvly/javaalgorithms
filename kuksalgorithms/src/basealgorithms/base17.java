package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

public class base17 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// card dummy cnt
		int cardCnt = Integer.parseInt(br.readLine());

		// card dummy
		int cardArr[] = new int[cardCnt];

		// StringTokenizer using
		for (int i = 0; i < cardCnt; i++) {
			cardArr[i] = Integer.parseInt(br.readLine());
		}

		// my card cnt
		int myCnt = Integer.parseInt(br.readLine());

		// my card
		int myArr[] = new int[myCnt];

		for (int i = 0; i < myCnt; i++) {

		}

	}

}
