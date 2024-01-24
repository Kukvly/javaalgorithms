package gd.gold_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

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
 *         1. 두 수 4와 4를 고른다.
 *         2. X=2를 고른다. (X는 소수)
 *         3. 4를 지우고, 4/2 & 다음 4를 지우고, 4/2
 *         
 *
 */

public class B_2904 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		int cntArr[] = new int[n];
		int rtn=0;
		int rtnArr[] = new int[n];
		Queue<Integer> kuksQueue = new LinkedList<>();
		Map<Integer, Integer> kuksMap = new HashMap<Integer, Integer>();
		
//		System.out.println("sosu(3): " + sosu(3));
		
		for (int i = 0; i < n; i++) {
			int x=2;
			kuksQueue.offer(Integer.parseInt(input[i]));
			int poll = kuksQueue.poll();
//			System.out.println("poll: " + poll);
			for(int j=0; j<poll; j++) {
				if(x==2) {
					rtn=gcd(poll, x);
//					System.out.println("if1: " + rtn);
				} else if(x>2) {
//					System.out.println("x: " + x);
					if(sosu(x)) {
						rtn = gcd(poll, x);
//						System.out.println("if2: " + rtn);
					}
					
//					System.out.println("else: "+ rtn);
				}
				x++;
			}
			cntArr[i] = x-2;
			rtnArr[i] = rtn;
			kuksMap.put(cntArr[i], rtnArr[i]);
		}
		
		Arrays.sort(cntArr);
		Arrays.sort(rtnArr);
		
		System.out.println(cntArr.toString());
		System.out.println(rtnArr.toString());
//		System.out.println(cntArr[n-1]  + " " + rtnArr[n-1]);
	}

	/*
	 * 최대공약수를 계속해서 구한 다음에 sort해서 젤 큰애를 출력하자
	 * rtn이 가장 크면서 cnt가 가장 작은 건
	 */

	public static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return gcd(b, a%b);
	}
	
	public static Boolean sosu (int n) {
		
		if(n<2) return false;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}