package sv.silver_4;

/**
 * 
 * int k
 * 
 * k개의 정수 1개씩
 * 정수는 0 ~ 1,000,000
 * 
 * 정수가 0이면, 가장 최근에 쓴 수를 지우고, 아닐 경우 해당 수를 쓴다.
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10773 {
	public static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		int sum = 0 ;
		Stack<Integer> kuksStack = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(!kuksStack.isEmpty()) {
					kuksStack.pop();
				}
			} else {
				kuksStack.push(num);
			}
		}
		
		while(!kuksStack.isEmpty()) {
			sum+=kuksStack.pop();
		}
		
		System.out.println(sum);
	}
}