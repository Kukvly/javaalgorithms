package kuksalgorithms;

/*
 * 크기가 N인 집합 A={A1,A2,...AN}, 정수 K가 주어진다.
 * 좋은 집합 조건
 * S에는 두 개 이상의 수가 포함
 * S의 서로 다른 두 원소 a,b(S의 원소)에 대해서 a+b는 K의 배수가 아니다.
 * 좋은 집합의 개수는?
 * 
 * (2<=N, K<=100000)
 * (1<=Ai<=10^9)
 * 
 * 요약하자면 서로소인 각 원소들의 부분집합의 개수를 구하라는 것
 * */

import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class Apr_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int num[] = new int[n];
		
		//Map <String, List> _kuksMap = new HashMap<String, List>();
		
		System.out.println("n: " + n);
		System.out.println("k: " + k);
		
		for(int i=0; i<n; i++) {
			num[i] = input.nextInt();
			System.out.println("num: " + num[i]);
		}
		
		int rtn[] = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("num: " + num[i]);
		}
		
		int count = 0;
		
		System.out.println("count: " + (count%1000000007));
	} 

}
