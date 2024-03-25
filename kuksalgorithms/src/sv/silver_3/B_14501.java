package sv.silver_3;

/**
 * 14501 퇴사
 * 
 * n+1일째 되는 날 퇴사를 하기 위해서, 남은 n일 동안 최대한 많은 상담을 하려 한다.
 * 
 * <n=7일 때의 상담표>
 * 		1일		2일		3일		4일		5일		6일		7일
 * Ti	3		5		1		1		2		4		2
 * Pi	10		20		10		20		15		40		200
 * 
 * ex.
 * 1일에 잡힌 상담 소요시간 -> 3일
 * 1일에 잡힌 상담 완료페이 -> 10
 * 
 * 5일에 잡힌 상담 소요시간 -> 2일
 * 5일에 잡힌 상담 완료페이 -> 15
 * 
 * 상담을 하는데 필요한 기간은 1일보다 클 수 있어서 n일의 상담을 다 못할 수도 있다.
 * 
 * 상담을 적절히 했을 때의 최대 수익
 * 즉, Pi가 최대가 될 때의 Ti를 같이 구해준다.
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14501 {
	public static int n, p, t;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		int rtn[][] = new int[n][2];
		for (int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");			
			p = Integer.parseInt(input[0]);
			t = Integer.parseInt(input[1]);
			rtn[i][0] = p;
			rtn[i][1] = t;
		}
		
	}

}
