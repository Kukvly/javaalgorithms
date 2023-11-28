package basealgorithms.b10;

/*
 *  type -> int (x)
 *  type -> long (o)
 * */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class base13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		long sum = 0;
		
		// 공백으로 입력 숫자 구분
		StringTokenizer st = new StringTokenizer(s, " ");
		
		while(st.hasMoreTokens()) {
			sum = sum + Long.parseLong(st.nextToken());
		}
		
		System.out.println(sum);
	}

}