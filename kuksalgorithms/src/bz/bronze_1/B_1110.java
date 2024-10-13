package bz.bronze_1;

/**
 * 
 * if(n<10) -> n *= 10;
 * 
 * int a = n/10; // 10의 자리
 * 
 * int b = n%10; // 1의 자리
 * 
 * int tmp = a+b;
 * 
 * int new = b * 10 + tmp%10
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1110 {
	
	public static int n, cycle = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int num = n;
		if(n==0) {
			System.out.print(1);
			return;
		}
		if(n<10) {
			num = n * 10;
		} 
				
		int newNum = num;
		do {
			newNum = func(newNum);
			cycle++;
		}while(newNum != n);
		
		System.out.println(cycle);
	}
	
	static int func(int n) {
		int a = n/10; // 10의 자리
		int b = n%10; // 1의 자리
		int tmp = a+b;
		int rtn = b*10 + tmp%10;
		
		return rtn;
	}

}
