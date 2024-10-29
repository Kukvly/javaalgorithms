package gd.gold_5;

import java.io.*;

/**
 * 
 * @author kukvly
 * 
 * 매일 매일 약 반알 먹는다. -> 선영이는 할아버지에게 약이 N개 담긴 병을 선물로 주었음
 * 첫째 날에 종수는 병에서 약 하나를 꺼낸다. -> 그 약을 반으로 쪼개서 한 조각은 먹고,
 * 다른 조각은 다시 병에 넣는다.
 * 
 * 다음 날부터 종수는 병에서 약을 하나 꺼낸다. (약은 한 조각 전체일 수도 있고, 쪼갠 반 조각일 수도 있다.)
 * 반 조각이라면 그 약을 먹고, 아니라면 반을 쪼개서 한 조각을 먹고, 다른 조각은 다시 병에 넣는다.
 * 
 * 종수는 손녀에게 한 조각을 꺼낸 날에는 W를, 반 조각을 꺼낸 날에는 H 보낸다.
 * 손녀는 할아버지에게 받은 문자를 종이에 기록해 놓는다.
 * 
 * 총 2N일이 지나면 길이가 2N인 문자열이 만들어지게 된다.
 * 
 * 이 때 가능한 서로 다른 문자열의 개수는 총 몇 개일까?
 * 
 * 입력 최대 케이스: 1000개
 * 병에 들어있는 약의 개수: N<=30
 * 입력 마지막 줄에는 0이 하나 주어짐
 * 
 * 출력
 * 각 테스트 케이스에 대해서 가능한 문자열의 개수를 출력한다.
 * 
 */

public class B_4811 {
	public static int n;
	public static long dp[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = 1;
		
		dp = new long[31][31];
		
		while(n!=0) {
			n = Integer.parseInt(br.readLine());
			if(n==0) return;
			System.out.println(func(n, 0));
		}
		
	}
	
	static long func(int w, int h) {
		if(w==0) return 1;
		if(dp[w][h] != 0) return dp[w][h];
		
		long rtn = 0;
		
		if(w>0) rtn += func(w-1,h+1);
		if(h>0) rtn += func(w,h-1);
		
		dp[w][h] = rtn;
		return rtn;
	}

}
