package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);	// m: 연산 개수
		
		

		Random rd = new Random();
		int rdIdx = rd.nextInt(2);
		
		String sayYes[] = {"YES", "yes"};
		
		String sayNo[] = {"NO", "no"};
		
		
		Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
		List<Map> numList = new ArrayList<Map>();
		/**
		 * 0 1 2
		 * 0 3 2
		 * 
		 *  0 1 2 를 하면
		 *  {1, 2}가 되게끔
		 *  그리고
		 *  {1, 2}에 3만 있는지, 2만 있는지, 3과 2 둘 다 있는지 체크
		 *  그 후 
		 *  3만 있으면 2를 추가 (input[1]만 있으면 input[2]만 추가)
		 *  2만 있으면 3을 추가 (input[2]만 있으면 input[1]만 추가)
		 *  둘 다 있으면 pass
		 *  else -> 둘 다 없으면
		 *  {2, 3} 새로 만들어준다.
		 *  
		 */
//		int numArr[] = new int[n+1];
//		
//		for(int i=0; i<n+1; i++) {
//			numArr[i]=i;
//		}
		
		input = br.readLine().split(" ");
		
		numMap.put(Integer.parseInt(input[1]),Integer.parseInt(input[1]));
		numMap.put(Integer.parseInt(input[2]),Integer.parseInt(input[2]));
		
		numList.add(numMap);

		for (int i=1; i<m+1; i++) {
			System.out.println("m: " + m);
			if (i==m) {
				return;
			}
			numMap.clear();
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[1]);
			int b = Integer.parseInt(input[2]);
			
//			System.out.println("----------------------");
//			System.out.println("a: " + a);
//			System.out.println("b: " + b);
//			System.out.println("----------------------");
			
			
//			System.out.println("numMap.toString(): " + numMap.toString());
			int l = numList.size();
			if(input[0].equals("0")) {
				System.out.println("0chk counting: " + (i-1));
				for(int j=0; j<l; j++) {
					if(numList.get(j).containsValue(numMap.get(a))
							&& !numList.get(j).containsValue(numMap.get(b))) {
						numList.get(j).put(b, b);
						System.out.println("1111");
					} else if(!numList.get(j).containsValue(numMap.get(a))
							&& numList.get(j).containsValue(numMap.get(b))) {
						numList.get(j).put(a, a);
						System.out.println("2222");
					} else if (numList.get(j).containsValue(numMap.get(a))
							&& numList.get(j).containsValue(numMap.get(b))) {
						System.out.println("3333");
					} else {
						numMap.put(a, a);
						numMap.put(b, b);
						System.out.println("4444");
					}
					numList.add(numMap);
					System.out.println("if: " + numList.get(0));
				}
			} else if(input[0].equals("1")) {
				System.out.println("else if: " + numList.get(0));
				if(elmContain(numList.get(i-1),a,b)) {
					System.out.println(sayYes[rdIdx]);
				} else {
					System.out.println(sayNo[rdIdx]);
				}
			}
			
		}
		for(int k=0; k<numList.size(); k++) {
			System.out.println(numList.get(k).toString());
		}
	}
	
	public static Boolean elmContain(Map<Integer, Integer> kuksMap, int a, int b) {
		System.out.println("kuksmap access");
		if(kuksMap.containsValue(a) && kuksMap.containsValue(b)) {
			System.out.println("yun");
			return true;
		} else 
			System.out.println("kuk");
			return false;
	}
	
	
	

}
