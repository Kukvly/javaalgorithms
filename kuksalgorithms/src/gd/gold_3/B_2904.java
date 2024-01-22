package gd.gold_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
 */

public class B_2904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		int numArr[] = new int[n];
//		int rtn[] = new int[n-1];
		numArr[0] = Integer.parseInt(input[0]);
		for (int i = 1; i < n; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}
	}

	/*
	 * 최대공약수를 계속해서 구한 다음에 sort해서 젤 큰애를 출력하자
	 */

	public static int maxDiv(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return maxDiv(b, a%b);
	}
}