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
 * */

import java.util.Scanner;

public class Apr_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		int num[] = new int[n];
		
		// TODO Auto-generated method stub
		System.out.println("n: " + n);
		System.out.println("k: " + k);
		
		for(int i=0; i<n; i++) {
			num[i] = input.nextInt();
			System.out.println("num: " + num[i]);
		}
		
		int count = 0;
		
		System.out.println("count: " + (count%1000000007));
	} 

}
