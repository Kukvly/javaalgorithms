package sv.silver_4;

/**
 * 설탕은 5kg, 3kg 단위로 만들 수 있음
 * 최대한 봉지 수가 적게 해야 함
 * ex. 18일때
 * 3*6 보다는 5*3 + 3*1 이 더 효율적
 * 
 * 정확하게 n kg를 맞출 수 없다면 -1 출력
 * 
 * 
 * 5의 배수
 * 3의 배수
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 3 <= n <= 5000
		int n = Integer.parseInt(br.readLine());
		int rtn = sugar(n);
		System.out.println(rtn);
	}
	public static int sugar(int n) {
		int cnt = 0;
		
		while(n>0) {
			if(n%5==0) {
				n-=5;
				cnt++;
			} else if(n%3==0) {
				n-=3;
				cnt++;
			} else if(n>5) {
				n-=5;
				cnt++;
			} else {
				cnt = -1;
				break;
			}
		}
		return cnt;
	}

}
