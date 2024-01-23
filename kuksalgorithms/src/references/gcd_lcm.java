package references;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gcd_lcm {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		System.out.println("n: " + n);
		System.out.println("m: " + m);
		
		
		int gcd = kuksGcd(n, m);
		int lcm = (n * m)/gcd;
		
		System.out.println("최대 공약수: " + gcd);
		System.out.println("최소 공배수: " + lcm);

	}
	
	public static int kuksGcd(int n, int m) {
		if(n%m==0) {
			return m;
		}
		return kuksGcd(m, n%m);
	}

}
