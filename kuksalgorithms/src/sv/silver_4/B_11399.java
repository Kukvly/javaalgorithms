package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author kukvly
 * 
 * n: 사람수
 * arr[i]: i번째 사람이 돈을 인출하는데 걸리는 시간
 * 
 * arr[1] = 3
 * arr[2] = 1
 * arr[3] = 4
 * arr[4] = 3
 * arr[5] = 2
 * arr[2] arr[5] arr[1] arr[4] arr[3]
 * 1		2		3		3	4
 * 1 + 1+2 1+2+3+ 1+2+3+3 1+2+3+3+4
 * 1	3 	6		9		13
 * 22 + 10 = 32
 *
 */

public class B_11399 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int [n];
		String input[] = br.readLine().split(" ");
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		int sum = 0;
		int tmp = 0;
		for (int i=0; i<n; i++) {
			tmp += arr[i];
			sum += tmp;
		}
		
		System.out.println(sum);
		
	}

}
