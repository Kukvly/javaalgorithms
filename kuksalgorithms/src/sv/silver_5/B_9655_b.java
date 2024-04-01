package sv.silver_5;

/**
 * 돌게임
 * 탁자 위에 돌 n개가 있음
 * 상근이와 창영이는 턴을 번갈아가며 돌을 가져감
 * 돌을 1개 or 3개 가져갈 수 있음
 * 마지막 돌 가져가는 사람이 이김
 * 두 사람이 완벽하게 게임을 했을 때 이기는 사람을 구하는 프로그램을 작성하시오.
 * 게임은 상근이 선 스타트
 * 
 * input
 * 첫째 줄에 n 주어짐
 * (1<=n<=1000)
 * 
 * output
 * 상근이가 이기면 SK, 창영이가 이기면 CY
 * 
 * 내가 생각했을 떄...
 * n이 줄고 줄어서 2가 되었을 때,
 * 바로 다음 차례인 사람이 지게 된다.
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9655_b {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		if(n%2==1) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
		
		
	}

}
