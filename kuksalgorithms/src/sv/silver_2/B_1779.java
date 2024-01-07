package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * n m 입력
 * n개는 '들어간 문장 풀어서 출력할 문구 개수
 * m개는 약어를 풀어서 출력할 문구 개수
 * 
 * n+m개가 입력된 후 바로 다음줄에 문장 입력
 * 해당 문장에서 n, m개의 입력된 문구들이 최초로 나올 때에만 변환
 * 
 * 다 입력 후 엔터를 해도 위에꺼랑 이어지지만,
 * #이 나오면 다시 초기화
 * 
 *
 */

public class B_1779 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int c = Integer.parseInt(input[0]);
		int a = Integer.parseInt(input[1]);
		
//		for(int i=0; i<(c+a); i++) {
//			for(int j=0; j<3; j++) {
				input = br.readLine().split(" -> ");
				System.out.println(input[0]);
				System.out.println(input[1]);
				String yun = input[0].substring(1, input[0].length()-1);
				String kuk = input[1].substring(1, input[1].length()-1);
				System.out.println(yun);
				System.out.println(kuk);
				
				
//			}
//		}
	}

}
