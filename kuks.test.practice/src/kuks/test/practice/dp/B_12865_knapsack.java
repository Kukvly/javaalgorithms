package kuks.test.practice.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 12865
/**
 * 
 * @author kukvly
 * <평범한 배낭>
 * 
 * 이 문제는 아주 평범한 배낭에 관한 문제이다.
 * 물건의 개수: n
 * 물건의 무게: w
 * 가중치: v
 * 
 * 최대 무게: k
 * 
 * 가중치 합의 최댓값은?
 * 
 * 첫 줄에 물품의 수 n (1<=n<=100)와 버틸 수 있는 무게 k (1<=k<=100000)
 * 두 번째 줄부터 n개의 줄에 걸쳐 각 물건의 무게 w (1<=w<=100000)와
 * 해당 물건의 가치 v (0<=ㅍ<=1000)가 주어진다.
 *
 */

public class B_12865_knapsack {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]); // 물건 개수
		int k = Integer.parseInt(input[1]); // 무게
		
		Map<Integer, Integer> kuksMap = new HashMap<Integer,Integer>();
		List<Object> kuksList = new ArrayList<Object>();
		for(int i=0; i<n; i++) {
			input = br.readLine().split(" ");
			int w = Integer.parseInt(input[0]);
			int v = Integer.parseInt(input[1]);
			kuksMap.put(w, v);
			kuksList.add(kuksMap);
		}
		
		
	}

}
