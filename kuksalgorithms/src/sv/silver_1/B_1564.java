package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

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
		Stack<Character> kukStack = new Stack<>();

		for (int i = tmpArr.length - 1; i >= 0; i--) {
			if (tmpArr[i] != '0') {
				for(int j=i; j>=i-4; j--) {
					kukStack.add(tmpArr[j]);
				}
				break;
			}
		}
		int size = kukStack.size();
		for (int i=0; i<size; i++) {
			System.out.print(kukStack.pop());
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
