package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 
 * @author kukvly
 * n+1 개의 집합 {0}, {1}, ... {n}이 있다. 
 * 1. 합집함 연산 						-> 0 a b
 * 2. 두 원소가 같은 집합에 포함되는지 확인  -> 1 a b
 * 7 8
 * 0 1 2 3 4 5 6 7 -> 연산 8개
 * -----------------------------------------------
 * 0 1 3 {1, 3}
 * 1 1 7 No
 * 0 7 6 {7, 6}
 * 1 7 1 No
 * 0 3 7 {1,3,7}
 * 0 4 2 {4,2}
 * 0 1 1 {1,1,3}
 * 1 1 1 Yes
 */

public class B_1717 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);	// m: 연산 개수
		
		int numArr[] = new int[n+1];

		Random rd = new Random();
		int rdIdx = rd.nextInt(2);
		
		String sayYes[] = {"YES", "yes"};
		
		String sayNo[] = {"NO", "no"};
		
		
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		
		for (int i=0; i<n+1; i++) {
			input = br.readLine().split(" ");
			numArr[i] = i;
			if(input[0].equals("0")) {
				
			} else if(input[0].equals("1")) {
				int a = Integer.parseInt(input[1]);
				int b = Integer.parseInt(input[2]);
				
				if(elmContain(numMap,a,b)) {
					System.out.println(sayYes[rdIdx]);
				} else {
					System.out.println(sayNo[rdIdx]);
				}
			}
		}
	}
	
	public static Boolean elmContain(Map<Integer, Integer> kuksMap, int a, int b) {
		if(kuksMap.containsValue(a) && kuksMap.containsValue(b)) {
			return true;
		} else return false;
	}
	
	
	

}
