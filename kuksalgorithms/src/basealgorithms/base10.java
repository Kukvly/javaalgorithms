package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author kukvly
 * 
 *         수열 정렬 (1015) P[0], P[1], ...., P[N-1]은 0부터 N-1까지(포함)의 수를 한 번씩 포함하고 있는
 *         수열이다. 수열 P를 길이가 N인 배열 A에 적용하면 길이가 N인 배열 B가 된다. 적용하는 방법은 B[P[i]] =
 *         A[i]이다. 배열 A가 주어졌을 때, 수열 P를 적용한 결과가 비내림차순이 되는 수열을 찾는 프로그램을 작성하시오.
 *         비내림차순이란, 각각의 원소가 바로 앞에 있는 원소보다 크거나 같을 경우를 말한다. 만약 그러한 수열이 여러개라면 사전순으로
 *         앞서는 것을 출력한다.
 * 
 *         [Input] 첫째 줄에 배열 A의 크기 N이 주어진다. 둘째 줄에는 배열 A의 원소가 0번부터 차례대로 주어진다. N은
 *         50보다 작거나 같은 자연수이고, 배열의 원소는 1,000보다 작거나 같은 자연수이다. 3 2 3 1
 * 
 *         [Output] 첫째 줄에 비내림차순으로 만드는 수열 P를 출력한다. 1 2 0
 * 
 *         수열: P 배열: A -> A.length = N
 * 
 *         P를 A에 적용시 배열: B -> B.length = N
 * 
 *         적용방법: B[P[i]] = A[i] P = [2 1 3 1] P[0]=2 P[1]=1 P[2]=3 P[3]=1 2 1 3
 *         1 1 2 1. 내림차순정렬 P[1] P[3] P[0] P[3]
 * 
 * 
 *         2. 중복값 체
 * 
 * 
 * 
 * 
 * 
 */

public class base10 {
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

		String[] input = buffer.readLine().split(" ");
		int n = Integer.parseInt(input[0]);

		String pData = buffer.readLine();
		StringTokenizer st = new StringTokenizer(pData, " ");

		int[] p = new int[n];
		int[] tmp = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			tmp[i] = p[i];
			System.out.print("p[" + i + "]: " + p[i] + " ");	// 2 1 3 1
			System.out.println();
		}

		Arrays.sort(p);
		for (int i=0; i<p.length; i++) {
			tmp[i] = p[i];
			System.out.print(tmp[i] + " ");
		}

		/*
		 * for(int i=0; i<p.length; i++){ for (int j=0; j<p.length; j++){ if (p[i] ==
		 * p[j]) { for(int k=1; k<j; k++) { tmp[j] = p[i] +k; } }
		 * 
		 * else if(p[i]==(p[j])) { tmp[i] = p[j] - 1; } }
		 * System.out.println("tmp["+i+"]: " + tmp[i]); }
		 */

//		for(int i=0; i<p.length; i++){
//			for (int j=0; j<p.length; j++{
//				if() {
//					
//				}
//			}
//		}
	}

}
