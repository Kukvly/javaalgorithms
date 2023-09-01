package references;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * @author kukvly
 * 입력받은 수 N개의 합 출력
 * InputExample: 1 2 3 4 5 
 */

public class bufferUsingGuide_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		// 공백으로 입력 숫자 구분
//		StringTokenizer st = new StringTokenizer(s, " ");
		
		// 콤마(,)로 입력 숫자 구분
		StringTokenizer st = new StringTokenizer(s, ",");		
		int sum = 0;
		while(st.hasMoreTokens())
			sum += Integer.valueOf(st.nextToken());
		System.out.println(sum);
	}

}
