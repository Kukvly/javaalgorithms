package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly 팩토리얼5 -> N!의 0이 아닌 뒤 5자리
 * 
 *         9<=input<=1,000,000
 */

public class B_1564 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());

		System.out.println(factorial(n));
		String tmp = String.valueOf(factorial(n));
		char tmpArr[] = tmp.toCharArray();

		for (int i = 0; i < tmpArr.length; i++) {
			System.out.println(tmpArr[i]);
		}
		
		System.out.println("-------------------------------");
		
		for (int i = tmpArr.length-1; i >= 0; i--) {
			System.out.println(tmpArr[i]);
		}
	}

	public static long factorial(long n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			n *= factorial(n - 1);
			return n;
		}
	}
}
