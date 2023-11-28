package basealgorithms.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class base6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int n = Integer.parseInt(input1);
		
		String[] input2 = br.readLine().split(" ");
		int[] arr = new int[n];
		int[] tmp = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		
		// 여기부터 정열
		
		Arrays.sort(arr);
		for(int i: arr) {
			tmp = arr;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("tmp[" + i +"]: " + tmp[i]);
		}
//		
		/**
		 * 각 입력받은 숫자의 index 값이 출력되어야 함
		 * 
		 */
	}

}
