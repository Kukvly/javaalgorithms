package sv.silver_3;

/**
 * input
 * 1. 테스트케이스
 * 2. 출발점 도착점
 * 3. 행성계 개수
 * 4. 행성계 중점 & 반지름
 * 
 * 행성계의 경계가 맞닿거나 서로 교차하는 경우는 없다.
 * 또한, 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 역시 입력으로 주어지지 않는다.
 * 
 * -1000<=x1,y1,x2,y2,cx,cy<=1000
 * 1<=r<=1000
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1004 {

	static int cnt = 0;
	static int outCnt = 0;
	static int inCnt = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0; i<t; i++) {
			String input[] = br.readLine().split(" ");
			
			int x1 = Integer.parseInt(input[0]);
			int y1 = Integer.parseInt(input[1]);
			int x2 = Integer.parseInt(input[2]);
			int y2 = Integer.parseInt(input[3]);
				
			int n = Integer.parseInt(br.readLine());
			for (int j=0; j<n; j++) {
				input = br.readLine().split(" ");
				int cx = Integer.parseInt(input[0]);
				int cy = Integer.parseInt(input[1]);
				int r = Integer.parseInt(input[2]);
				
				if (kuksCheck(x1,y1,cx,cy,r)^kuksCheck(x2,y2,cx,cy,r)) {
					cnt++;
				}
			}
			
			
			System.out.println(cnt);
			
			cnt = 0;
		}
	}
	
	public static boolean kuksCheck(int x, int y, int cx, int cy, int r) {
		return (cx-x)*(cx-x) + (cy-y)*(cy-y) < (r*r);
	}

}
