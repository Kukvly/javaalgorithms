package bz.bronze_2;

/**
 * 
 * @author kukvly
 * 
 * 
 * d^2 = (h*k)^2 + (l*k)^2
 * d^2 = k^2(h^2 + l^2)
 * (d/k)^2 = h^2 + l^2
 * l^2 = (d/k)^2 - h^2
 * l = Math.sqrt((d/k)^2 - h^2)
 * 
 * k^2=(w/(h*l))
 * 
 * w = (h*k) * (l*k)
 * w = k^2 * (h*l)
 * l = (w/h)*(1/(k^2))
 * 
 * (d/k)^2 - h^2 = (w/h)^2 * (1/(k^4))
 * 
 * 
 * output
 * h w
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class B_1297 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int d = Integer.parseInt(input[0]); // 대각선 길이
		int h = Integer.parseInt(input[1]); // 높이율
		int l = Integer.parseInt(input[2]); // 너비율 -> 길이율
		
		double k = d/(Math.sqrt((Math.pow(h, 2) + Math.pow(l, 2))));
		
		double height = (h*k);
		double length = (l*k);
		
		System.out.println((int) height + " " + (int) length);
		
	}
}