package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1699_a {
	
	public int dp[] = new int [100000];
	public static int knum = 0;
	public static int cnt = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		int tmpSqrt = (int) Math.sqrt(n);
//		int tmpPow = (int) Math.pow(tmpSqrt, 2);
//		System.out.println(tmpSqrt);
//		System.out.println(tmpPow);
		

		kuks(n);

		
		System.out.println(cnt);
		
	}
	
	// n: 11
	public static void kuks(int n) {
		int tmpSqrt = (int) Math.sqrt(n);	// 34
		int tmpPow = (int) Math.pow(tmpSqrt, 2); // 3^2
		
		knum = n - tmpPow;
		if(knum == 0) {
			cnt++;
		} else {
			cnt++;
			if(knum>3) {
				kuks(knum);	
			} else {
				cnt += knum;
			}	
		}
		
		
	}

}
