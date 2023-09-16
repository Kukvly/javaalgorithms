package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class base6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input1 = br.readLine();
		int n = Integer.parseInt(input1);
		
		String[] input2 = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(input2[i]);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println("arr["+i+"]: " + arr[i]);
		}
		//System.out.println("arr["+i+"]: " + arr[i]);
		
	}

}
