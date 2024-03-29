package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9184 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String input[] = br.readLine().split(" ");
			if(input[0].equals("-1") && input[1].equals("-1") && input[2].equals("-1")) {
				break;
			}
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int c = Integer.parseInt(input[2]);
			
			System.out.println("w("+ a + ", " + b + ", " + c + ") = " + w(a,b,c));	 
		}
		
	}
	
	public static int w(int a, int b, int c) {
		if (a<=0 || b<=0 || c<=0) {
			return 1;
		} else if(a>20 || b>20 || c>20) {
			return w(20, 20, 20);
		} else if(a<b && b<c) {
			return (w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c));
		} else {
			return w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		}
	}

}
