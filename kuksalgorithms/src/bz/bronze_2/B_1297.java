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
		
		double d = Double.parseDouble(input[0]); // 대각선 측정값
		double h = Double.parseDouble(input[1]); // 높이율
		double w = Double.parseDouble(input[2]); // 넓이율
		
		double k = 0;
		double l = 0;
		
		k = Math.sqrt(Math.pow((d/h),2) -  (w * Math.pow((1/h), 4)));
		
		l = Math.sqrt(Math.pow(d,2)-(Math.pow(h, 2)*Math.pow(k, 2)));
		System.out.println(l);
		System.out.println(k);
		
		double rtnh = (h*k); // 높이: h x k
		double rtnw = (h*k*l*k);
		
		System.out.println(Math.floor(rtnh) + " " + Math.floor(rtnw));
		
	}

}