package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_10828 {

	public static void main(String[] args) throws IOException{
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			if(input.length == 2) {
				stack.push(Integer.parseInt(input[1]));
			} else {
				if(input[0].equals("pop")) {
					if(stack.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(stack.pop());
					}
				} else if(input[0].equals("size")) {
					System.out.println(stack.size());
				} else if(input[0].equals("empty")) {
					if(stack.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else if(input[0].equals("top")) {
					if(stack.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(stack.peek());
					}
				}
			}
		}
	}

}
