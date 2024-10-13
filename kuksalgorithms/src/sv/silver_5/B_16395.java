package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_16395 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");

		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		System.out.println(func(n-1, k-1));
	}
	
	public static int func(int n, int k) {
		if(k==0 || k==n) {
			return 1;
		}
		return func(n-1, k-1) + func(n-1, k);
	}

}
