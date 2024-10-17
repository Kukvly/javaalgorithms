package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 오토에버스러운 문제?!
 * n줄에 0~9 숫자가 3개씩 적혀있다.
 * 
 * 
 * */


public class B_2096 {
	
	static int maxNum = 0;
	static int minNum = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int maxDp[] = new int[3];
		int minDp[] = new int[3];
		
		int tmpMax[] = new int[3];
		int tmpMin[] = new int[3];
		
		String input1[] = br.readLine().split(" ");
		for(int i=0; i<3; i++) {
			maxDp[i] = Integer.parseInt(input1[i]);
			minDp[i] = Integer.parseInt(input1[i]);
		}
		
		for(int i=1; i<n; i++) {
			String input2[] = br.readLine().split(" ");
			for (int j=0; j<3; j++) {
				tmpMax[j] = Integer.parseInt(input2[j]);
				tmpMin[j] = Integer.parseInt(input2[j]);
			}

			tmpMax[0] += Math.max(maxDp[0], maxDp[1]);
			tmpMax[1] += Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
			tmpMax[2] += Math.max(maxDp[1], maxDp[2]);
		
			tmpMin[0] += Math.min(minDp[0], minDp[1]);
			tmpMin[1] += Math.min(minDp[0], Math.min(minDp[1], minDp[2]));
			tmpMin[2] += Math.min(minDp[1], minDp[2]);
			
			// DP update
			for(int j=0; j<3; j++) {
				maxDp[j] = tmpMax[j];
				minDp[j] = tmpMin[j];
			}
		}
		
		// finally
		int maxRtn = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
		int minRtn = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));
		
		System.out.print(maxRtn + " " + minRtn);
	}

}
