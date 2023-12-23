package sv.silver_1;

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
 */

public class B_1325 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int a[] = new int[m + 1];
		int b[] = new int[m + 1];

		int aCnt[] = new int[m + 1];
		int bCnt[] = new int[m + 1];

		for (int i = 1; i < m + 1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a[i] = Integer.parseInt(st.nextToken());
			b[i] = Integer.parseInt(st.nextToken());
			aCnt[i] = 0;
			bCnt[i] = 0;
		}
		// 3이 1을 신뢰하고
		// 3이 2를 신뢰한다
		// 4가 3을 신뢰하고
		// 5는 3을 신뢰한다.

		for (int i = 1; i < m + 1; i++) {
			for (int j = 1; j < m + 1; j++) {
				if (a[i] == a[j] && i !=j) {
					aCnt[i]++;
				} 
				
				
				if(b[i] == b[j] && i !=j) {
					bCnt[i]++;
				}

			}
			System.out.println("aCnt[" + i + "]: " + aCnt[i]);
			System.out.println("bCnt[" + i + "]: " + bCnt[i]);

		}

		/*
		 * 4 -> 3 5 -> 3 3 -> 1 3 -> 2 a가 b를 신뢰하니까 b[i]의 카운트가 a[i]에서 많이 나오고
		 * 
		 * 4 2 1 2 2 3 3 1
		 * 
		 * b[i]
		 * 
		 * a[1] b[1] a[2] b[2] a[3] b[3] a[4] b[4]
		 * 
		 */

		// return array sort
		System.out.println();

	}

}
