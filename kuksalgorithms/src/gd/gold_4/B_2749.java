package gd.gold_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// f(n) = f(n-1) + f(n-2)

public class B_2749 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(fibonacci(n)%1000000);
		
	}
	
	public static long fibonacci(long n) {
		if(n==0) {
			return 0;
		} else if(n==1) {
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}
