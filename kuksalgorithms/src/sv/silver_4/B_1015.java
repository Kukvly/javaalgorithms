package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 비내림차순
 * 
 * 수열 P
 * 길이 n인 배열 a에 적용하면 길이가 n인 배열 b가 된다.
 * b[p[i]] = a[i] 
 * 
 * n<=50
 * 
 * */


public class B_1015 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String input[] = br.readLine().split(" ");
		
		int a[] = new int[n];

		for (int i=0; i<n; i++) {
			a[i] = Integer.parseInt(input[i]);
		}
		
		// logic
		int arr[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0] = a[i];
			arr[i][1] = i;
		}
		
		// 람다식
		Arrays.sort(arr,Comparator.comparingInt(o -> o[0]));
		
		int p[] = new int[n];
		
		for(int i=0; i<n; i++) {
			p[arr[i][1]] = i;
		}
		for(int i=0; i<n; i++) {
			System.out.print(p[i] + " ");
		}
		
	}

}
