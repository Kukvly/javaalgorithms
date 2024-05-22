package bz.bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_24416 {

	static int n, cnt1, cnt2;
	static int f[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		f = new int [n+1];
		f[1] = 1;
		f[2] = 2;
		
		cnt1 = 1;
//		cnt2 = 0;
		fibo1(n);
//		fibo2(n-2);
		
		System.out.println(cnt1/2);
		System.out.println(n - 2);

	}
	
	public static int fibo1 (int n){
		cnt1++;
		if(n==1 || n==2) {
			return 1;
		} else {
			return fibo1(n-1) + fibo1(n-2);
		}
	}
	
//	public static int fibo2 (int n){
//		cnt2++;
//		for (int i=3; i<=n; i++) {
//			f[i] = f[i-1] + f[i-2];
//		}
//		
//		return f[n];
//	}

}
