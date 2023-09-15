package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class base5 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		double rtn=0;
		
		if((a>0 && a<10)|| (b>0 && b<10)) {
			rtn = div(a,b);
		};
		
		System.out.println(rtn);
	}
	
	public static double div(int a, int b) {
		double c = a;
		double d = b;
		return c/d;
	}

}
