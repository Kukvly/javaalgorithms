package gd.gold_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * @author kukvly 1. n개의 수 중에서 a와 b를 골라서 a를 나눌 수 있는 소수 x를 고른다. 2. a를 지우고, a/x를
 *         쓰고, b를 지우고 bxX를 쓴다.
 * 
 *         1,2 를 무한 반복
 * 
 *         점수는 종이에 적혀있는 모든 수의 최대공약수이다.
 * 
 *         출력 가장 높은 점수와 이 점수를 얻기 위해 최소 몇 번해야 되는 지
 * 
 * 
 *         1. 두 수 4와 4를 고른다. 2. X=2를 고른다. (X는 소수) 3. 4를 지우고, 4/2 & 다음 4를 지우고,
 *         4/2
 * 
 *         모든 수에 적힌 최대공약수의 최댓값을 구하려면 각각의 점수를 소인수 분해했을 때 공통적으로 들어있는 소수의 곱이 최대가 되면
 *         됩니다.
 * 
 *         최대가 되는 gcd -> n개의 수를 소인수 분해하 나오는 소수 개수를 n으로 나누면 된다.
 * 
 *         즉 결론은 숫자가 n개 있는데 그걸 걍 분해한담에 소인수를 분배해서 점수 젤크게 나오게하고 그 점수가 몇번에 걸쳐서 나오는지
 *         카운트를 해라 이소리다.
 * 
 *         8 2^3 24 3 * 2*3 9 3^2
 * 
 *         turn.1 8 -> 4 24 -> 24 9 -> 9 * 2
 * 
 *         turn.2 4 -> 4 24 -> 12 9 -> 9 *2 * 2
 * 
 *         turn.3 4 -> 4 * 3 24 -> 12 = 4 * 3 9 -> 3 * 2 * 2 = 4 * 3
 * 
 *         최대가 되는 gcd n개의 수를 소인수 분해하여 나오는 각각의 소수 개수를 n으로 나눠준다. 8 24 9 8: 2가 3개
 *         24: 2가 3개, 3이 1 9: 3이 2
 * 
 *         n=입력받은 수 갯수=3 2=> 총 6개 3으로 나누면 2개 (2 * 2) 3=> 총 3개 3으로 나누면 1개 (3 * 1)
 *
 *         이동 횟수 if(각각의 점수에서 소수 등장 횟수) < (
 *
 * 
 */

public class B_2904 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 에라토스테네스의 체
		ArrayList<Integer> primes = new ArrayList<>();
		boolean[] visit = new boolean[1000010];

		for (int i = 2; i < 1000000; i++) {
			if (!visit[i]) {
				primes.add(i);
				for (int j = i; j < 1000000; j += i) {
					visit[j] = true;
				}
			}
		}

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[110];
		int[] count = new int[100000];
		int[][] count2 = new int[110][100000];
		int maxScore = 1;
		int moveCount = 0;

		String input[] = br.readLine().split(" ");
		
		for (int i = 0; i < n; i++) {
			// 입력
			arr[i] = Integer.parseInt(input[i]);

			// 구해둔 소수들로 나눠봄
			for (int j = 0; j < primes.size(); j++) {
				int p = primes.get(j);
				if (p > arr[i])
					break;

				// 입력받은 수가 해당 소수로 더이상 나눠지지 않을때까지 나눔
				while (arr[i] % p == 0) {
					// 나누기
					arr[i] /= p;

					// 해당 소수가 전체 입력에서 몇번이나 나왔는지 기록
					count[j]++;

					// 현재 입력 값이 해당 소수를 몇 개나 갖고 있는지 기록
					count2[i][j]++;
				}
			}
		}

		// 모든 소수에 대해 반복
		for (int i = 0; i < primes.size(); i++) {
			// 해당 소수를 전체 입력의 수 N 으로 나눈 c는 최대 공약수에 포함될 수 있음
			// 예를 들어 N이 10이고, 소수 2가 N개의 숫자에서 20번 나왔으면
			// c 는 2이고, 2 ^ 2 = 4
			// 4는 최대 공약수에 포함됨
			int c = count[i] / n;
			if (c == 0)
				continue;

			// 최대 공약수에 포함
			maxScore *= (int) Math.pow(primes.get(i), c);

			for (int j = 0; j < n; j++) {
				// N 개의 숫자가 모두 2를 2개씩 갖고 있어야 총 20번의 2가 나올 수 있는데
				// 소수 2를 2개 미만으로 갖고있는 수가 있다면 반드시 2개 초과하여 갖고 있는 수가 있기에
				// 이를 나눠줘야함
				if (count2[j][i] < c) {
					// 모자란 2의 갯수만큼 moveCount(움직인 횟수)가 증가
					moveCount += c - count2[j][i];
				}
			}
		}

		System.out.println(maxScore + " " + moveCount);
	}
}