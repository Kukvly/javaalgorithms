package sv.silver_4;

/**
 * 로프 개수: n
 * 1 <= n <= 100,000
 * 
 * 여러 개의 로프를 병렬로 연결하면 각각의 로프에 걸리는 중량을 나눌 수 있음
 * k개의 로프를 사용하여 중량이 w인 물체를 w/k만큼 모두 고르게 걸리게 됨
 * 
 * 각 로프들에 대한 정보가 주어졌을 때, 이 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량 구하기
 * 로프 다 안써도 되고, 임의로 몇 개의 로프를 골라서 써도 됨
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		int sum = 0;
		
		int rtn = 0;
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);

		for (int i=0; i<n; i++) {
			int tmp = arr[i] * (n-i);
			rtn = Math.max(rtn, tmp);
		}
		
		
		System.out.println(rtn);
	}

}
