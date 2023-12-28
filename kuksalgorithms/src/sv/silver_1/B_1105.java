package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * L <= n <= R
 * 1<=L<=2,000,000,000
 * L<=R<=2,000,000,000
 * 
 * n 중에서 8이 가장 적게 들어있는 수에 들어있는 8의 개수 구하기
 *
 */

public class B_1105 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input [] = br.readLine().split(" ");
		long l = Long.parseLong(input[0]);
		long r = Long.parseLong(input[1]);
		
		long numArr[] = new long[(int)(r-l)+1];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = l+i;
		}
		
		
				
	}

}
