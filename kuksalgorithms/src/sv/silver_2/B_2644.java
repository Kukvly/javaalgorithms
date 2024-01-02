package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author kukvly
 * 촌수 계산
 * 
 * 여러 사람들에 대한 자식들 간의 관계가 주어졌을 때,
 * 주어진 두 사람의 촌수를 계산하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄: n
 * 둘째 줄: 촌수 계산해야 하는 서로 다른 두 사람의 번호: a, b
 * 셋째 줄: 부모 자식들 간의 관계의 개수: m
 * 넷째 줄 ~ : 부모 자식 간의 관계를 나타내는 두 번호가 m개의 줄에 나옴
 * (이때, 앞에 나오는 번호 x는 뒤에 나오는 정수 y의 부모 번호를 나타낸다.)
 * x: y의 부모번호
 * y: x의 자식 번호
 * 즉, 순서쌍 개념
 * 
 * 9
 * 7 3
 * 7
 * 1 2
 * 1 3
 * 2 7
 * 2 8
 * 2 9
 * 4 5
 * 4 6
 * 
 * 7과 3의 촌수 번호를 계산
 * 1 은 2, 3의 부모 (1,2)=1, (1,3)=1	1 - 2, 3
 * (2,7)=1, (2,8)=1, (2,9)=1		2 - 7,8,9
 * (4,5)=1, (4,6)=1
 *  
 * 
 * 
 * 
 * 
 * output
 * 입력에서 요구한 두 사람의 촌수를 나타내는 정수를 출력
 * 두 사람의 친척 관계가 전혀 없어 촌수를 계산할 수 없을 때에는 -1 출력
 *
 */

public class B_2644 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
		// a, b
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		
		int m = Integer.parseInt(br.readLine());
		Map<Integer,Integer> mMap = new HashMap<>();
		List<Map<Integer, Integer>> mList = new ArrayList<>();
		
		for (int i=0; i<m; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			mMap.put(x, y);
			mList.add(mMap);
		}
		System.out.println("");
		System.out.println("mMap: " + mMap.toString());
		System.out.println("mList: " + mList.toString());
	};

}
