package LV1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author kukvly
 * 마을의 수: n
 * 각 마을은 1차 수직선 상에 위치
 * 
 * 마을들 중 가장 거리가 가까운 두 마을을 먼저 방문
 * 처음 방문할 가능성이 있는 서로 다른 두 마을 조합의 수를 구하기
 * 
 * 2 <= n <= 1,000
 * 1 <= 마을 위치 <= 1,000,000
 * 
 * input
 * 5				// 마을 수 n
 * 1 3 5 8 10		// 마을 위치 posList
 */

public class village {

	static List<Integer> posList = new ArrayList<Integer>();
	static List<Integer> distList = new ArrayList<Integer>();
	static List<Object> memList = new ArrayList<Object>();
	
	static int pArr[] = new int [2];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		posList.add(Integer.parseInt(input[0]));
		for(int i=1; i<n; i++) {
			posList.add(Integer.parseInt(input[i])); 			// 수직선 기본 위치 저장
			distList.add(posList.get(i) - posList.get(i-1));	// x좌표 간 차이 저장
			pArr[0] = posList.get(i-1);							// 선위치
			pArr[1] = posList.get(i);							// 후위치
			memList.add(pArr);									// 선위치와 후위치를 좌표화 시킨 배열을 리스트에 저장
			System.out.println("memList: " + memList.get(i-1));
		}
		
	}
	
//	public int comb(int a, int b) {
//		int rtn = 0;
//		for(int i=a; i>b; i--) {
//			a *= (a-1);
//		}
//		rtn = (a/factorial(b));
//		return rtn;
//	}
//	
//	public int factorial(int n) {
//		for(int i=n; i>1; i--) {
//			n *= (n-1);
//		}
//		
//		return n;
//	}

}
