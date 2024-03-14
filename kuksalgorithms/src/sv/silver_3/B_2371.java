package sv.silver_3;

/**
 * input
 * n
 * 1 2 3 -1
 * 1 2 3 4 -1
 * 1 2 4 5 -1
 * 앞에서부터 차례로 K번째 수 구하기 -> K=4
 * 
 * K=3일 때,
 * 1 2 3
 * 1 2 3
 * 1 2 4
 * 
 * 위에 1 2 3 -1, 1 2 3 4 -1 이 비교가 되질 않음
 * 그래서 K+1을 하여 K=4를 출력
 * 
 * 우선 임의의 한 숫자행을 기준 패턴으로 잡고 한다?! -> 발상
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_2371 {

	static List<Object> paramList = new ArrayList<Object>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			long arr[] = new long [input.length];	
			for(int j=0; j<input.length; j++) {
				arr[j] = Long.parseLong(input[j]);
			}
			paramList.add(arr);
			printArray((long[]) paramList.get(i));
			System.out.println();
		}

	}
	
	static void printArray(long[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i != arr.length -1) {
				System.out.print(" ");
			}
		}
	}

}
