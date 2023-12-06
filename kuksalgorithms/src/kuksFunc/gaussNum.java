package kuksFunc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 결국에 싹 다 a0의 카운트를 만들어서 그 수만큼 더하면 되는 식
 *
 */

public class gaussNum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		//int n = Integer.parseInt(input[0]);
		double n = Double.parseDouble(input[0]);
		int p = Integer.parseInt(input[1]);
		int q = Integer.parseInt(input[2]);
		
//		An = 
		
		int a0 = 1;
		
		for (int i=0; i<n; i++) {
			GaussP(i, p);
			GaussQ(i, q);
		}
		
		
	}
	
	public static int GaussP(int i, int p) {
		double n=0;		
		int rstP=0;
		n=(i/p);
		rstP = (int)n;
		System.out.println(rstP);
		
		return rstP;
	}
	
	public static int GaussQ(int i, int q) {
		double m=0;
		int rstQ=0;
		m=(i/q);
		rstQ = (int)m;
		System.out.println(rstQ);
		
		return rstQ;
	}
	
	public static int An(int i, int p, int q) {
		
		return 0;
	}

}
