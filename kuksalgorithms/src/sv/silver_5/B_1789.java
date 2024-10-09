package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 * greedy algorithms
 * 
 * 
 */

public class B_1789 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		long s = Long.parseLong(br.readLine());
		
		long sum = 0;
		int cnt = 0;
		
		for(int i=1; ;i++) {
			sum +=i;
			cnt++;
			
			if(sum>s) {
				cnt--;
				break;
			}
//			System.out.println(i);
		}
		
		System.out.print(cnt);
	}

}
