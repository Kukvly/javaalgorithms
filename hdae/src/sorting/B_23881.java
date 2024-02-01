package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * 선택 정렬
 * 1. 주어진 리스트에서 최소값 찾기
 * 2. 최소값을 맨 앞이랑 교체
 * 3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체
 * 최소값을 "선택"해서 맨 앞에꺼랑 바꿔줌
 * 그 후 다음 차례대로 또 바꿀 때 마다 그 다음 최소값을 또 바꿔줌
 * 
 * 0: 4 1 3 5 2 6
 * 1: 1 4 3 5 2 6
 * 2: 1 2 4 3 5 6
 * 3: 1 2 3 4 5 6
 * 
 * 일반적으로는 위와 같지만 이 문제에서는 큰 수를 선택
 * 
 * 배열크기 n (5<=n<=10,000)
 * 교환 횟수 k (1<=k<=n)
 * 
 * k번째 교환되는 두 개의 수를 작은 수부터 한 줄에 출력
 *
 */

public class B_23881 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		input = br.readLine().split(" ");
		
		List<Integer>
		
		int numArr[] = new int[n];
		for(int i=0; i<n; i++) {
			numArr[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=)
	}

}
