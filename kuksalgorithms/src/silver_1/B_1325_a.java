package silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author kukvly 한 해커가 잘 알려진 어느 회사를 해킹하려 한다. PC: N개 한 번의 해킹으로 여러 PC를 해킹할 수 있는
 *         PC를 해킹하려 한다. 이 회사의 PC는 신뢰하는 관계, 신뢰하지 않는 관계로 이루어져 있다. A가 B를 신뢰하는 경우에는
 *         B를 해킹하면, A도 해킹할 수 있다. 이 회사의 PC의 신뢰하는 관계가 주어졌을 때, 한 번에 가장 많은 PC를 해킹할 수
 *         있는 PC의 번호를 출력하는 program을 작성하시오.
 * 
 *         input n <= 10,000 m <= 100,000
 * 
 *         n m (n=5, m=4) 3 1 3이 1을 신뢰한다. 3 2 3이 2를 신뢰한다. 4 3 4가 3을 신뢰한다. 5 3 5가
 *         3을 신뢰한다.
 * 
 *         output 첫째 줄에 해커가 한 번에 가장 많은 PC를 해킹할 수 있는 PC의 번호를 오름차순으로 출력 1 2
 *         
 *         DFS (깊이 우선 탐색) 사용 알고리즘
 */

public class B_1325_a {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int a[] = new int[m + 1];

		int fCnt[] = new int[m + 1];
		int bCnt[] = new int[m + 1];

		for (int i = 1; i < n + 1; i++) {
			a[i] = i;
			fCnt[i] = 0;
			fCnt[i] = 0;
		}

		for (int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			if (a[i] == Integer.parseInt(st.nextToken())) {
				fCnt[i]++;
			}

			if (a[i] == Integer.parseInt(st.nextToken())) {
				bCnt[i]++;
			}
		}

		for (int i = 1; i < m+1; i++) {
			System.out.println("fCnt[" +i+"]: " + fCnt[i]);
			System.out.println("bCnt[" +i+"]: " + bCnt[i]);
		}
		// return array sort
		System.out.println();

	}

}
