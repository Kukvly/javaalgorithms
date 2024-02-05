package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 *
 */

public class B_1003 {
	public static int zeroCnt, oneCnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n = 0;
		for (int i=0; i<t; i++) {
			zeroCnt = 0;
			oneCnt = 0;
			n = Integer.parseInt(br.readLine());
			fibonacci(n);
			System.out.println(zeroCnt + " " + oneCnt);
			
		}
	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			zeroCnt++;
			return 0;
		} else if(n==1) {
			oneCnt++;
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
		
}
