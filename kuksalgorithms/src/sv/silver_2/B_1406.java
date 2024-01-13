package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 한 줄로 된 간단한 에디터를 구현하려고 한다. 편집기는 영 소문자만을 기록할 수 있다.
 * 최대 600,000글자까지 입력 가능.
 * 이 편집기에는 '커서'라는 것이 있는데, 커서는 문장의 맨 앞(첫 번째 문자의 왼쪽), 문장의 맨 뒤(마지막 문자의 오른쪽),
 * 또는 문장 중간 임의의 곳(모든 연속된 두 문자 사이)에 위치할 수 있다.
 * 즉 길이가 L인 문자열이 현재 편집기에 입력되어 있으면, 커서가 위치할 수 있는 곳은 L+1가지 경우가 있다.
 * 이 편집기가 지원하는 명령어는 다음과 같다.
 * 
 * L: 커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
 * D: 커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
 * B: 커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
 *    삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문작 그대로임
 * P$: $라는 문자를 커서 왼쪽에 추가함
 * 
 * 
 * 
 */

public class B_1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		int cmdNum = Integer.parseInt(br.readLine());
		
		for (int i=0; i<cmdNum; i++) {
			String input[] = br.readLine().split(" ");
			if(input[0].equals("P")) {
				System.out.println(input[0]);
				System.out.println(input[1]);

			} else if(input[0].equals("L")) {
				System.out.println("Kuks");
			}
		}
		

		
	}

}
