package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly n m 입력 n개는 '들어간 문장 풀어서 출력할 문구 개수 m개는 약어를 풀어서 출력할 문구 개수
 * 
 *         n+m개가 입력된 후 바로 다음줄에 문장 입력 해당 문장에서 n, m개의 입력된 문구들이 최초로 나올 때에만 변환
 * 
 *         다 입력 후 엔터를 해도 위에꺼랑 이어지지만, #이 나오면 다시 초기화
 * 
 *
 */

public class B_1779 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int c = Integer.parseInt(input[0]);
		int a = Integer.parseInt(input[1]);
		int cnt = 0;
		String textArrBef[] = new String[c + a];
		String textArrAft[] = new String[c + a];
		for (int i = 0; i < c; i++) {
			input = br.readLine().split(" -> ");
			textArrBef[i] = input[0].replace("\"", "");
			textArrAft[i] = input[1].replace("\"", "");
//			System.out.println(textArrAft[i]);
		}
		for (int i = c; i < (c + a); i++) {
			input = br.readLine().split(" -> ");
			textArrBef[i] = input[0].replace("\"", "");
			textArrAft[i] = input[1].replace("\"", "") + " (" + input[0].replace("\"", "") + ")";
//			System.out.println(textArrAft[i]);
		}

		// # 조건 필요할 것으로 보임
			input = br.readLine().split(" ");
			for (int i=0; i<input.length;i++) {
				for(int j=0; j<textArrAft.length; j++) {
					if(textArrBef.toString().contains(input[i])) {
						input[i].replace(textArrBef[j], textArrAft[j]);
					}
				}
				System.out.print(input[i] + " ");
			}
//		}

//		for (int i = 0; i < c + a; i++) {
//			System.out.println(textArr[i]);
//		}
		
		//
		
		
//		StringBuilder sb = new StringBuilder();

//		while(cnt<2) {
//			String s = br.readLine();
//			sb.append(s + "\n");
//			if(s.contains("#")) {
//				cnt++;
//			}
//		}


//		System.out.println(sb);

//		System.out.println(sb.length());
	}

}
