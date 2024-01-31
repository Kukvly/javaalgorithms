package Impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/**
 * 
 * @author kukvly
 * 최소 힙
 * 
 * 1. 배열에 자연수 x를 넣는다.
 * 2. 배열에서 가장 작은 값을 출력하고, 그 값을 배열에서 제거한다.
 * 
 * 프로그램은 처음에 비어 있는 배열에서 시작하게 된다.
 * 
 * input
 * 첫째 줄에 연산의 개수 N (1<=N<=100,000)이 주어진다. 
 * 다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다.
 * 만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고,
 * x가 0이라면 배열에서 가장 작은 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
 * x는 2^31보다 작은 자연수 또는 0이고, 음의 정수는 입력으로 주어지지 않는다.
 * (x[i]<=2^31 or x[i]=0)
 * 
 * 9 // N(연산 개수)
 * 
 * 9개의 x 입력 (N개의 x 입력)
 * 0
 * 12345678
 * 1
 * 2
 * 0
 * 0
 * 0
 * 0
 * 32
 * 
 * output
 * 입력에서 0이 주어진 횟수만큼 답을 출력한다.
 * 만약 배열이 비어 있는 경우인데 가장 작은 값을 출력하라고 한 경우에는 0을 출력하면 된다.
 * 
 */

public class B_1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> xQueue = new PriorityQueue<>();

		int x = 0;
		for (int i=0; i<n; i++) {
			x = Integer.parseInt(br.readLine());
			if(x==0) {
				if(xQueue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(xQueue.poll());
				}
			} else {
				xQueue.offer(x);
			}

		}
	}

}
