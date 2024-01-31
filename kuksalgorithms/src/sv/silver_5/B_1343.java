package sv.silver_5;

/**
 * 연달아서 나오는 X가 홀수이면 -1 출력 -> 이 로직을 어떻게 구현하는가가 관건
 * 
 * X의 개수에서 4를 나눴을 때 나머지가 2이면 몫의 개수만큼 "AAAA" 출력 그리고 맨마지막에만 "BB"붙여줌
 * 
 * X의 개수에서 4를 나눴을 때 나머지가 0이면 몫의 개수만큼 "AAAA"만 출력
 * 
 * .이 오는건 상관 없음
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1343 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String patternA = "AAAA";
		String patternB = "BB";

		String input = br.readLine();
		char rtn[] = input.toCharArray();
		int xCnt = 0;

		StringBuffer sb = new StringBuffer();

		String rtnStr = "";
//		int dCnt = 0;
		for (int i = 0; i < rtn.length; i++) {
			if (rtn[i] == 'X') {
				xCnt++;
				if (i == rtn.length - 1) {
					if (xCnt % 2 == 1) {
						sb.delete(0, sb.length());
						System.out.println(-1);
						return;
					} else if (xCnt % 4 == 0) {
						for (int j = 0; j < (xCnt / 4); j++) {
							sb.append(patternA);
						}
					} else if (xCnt % 4 == 2) {
						for (int j = 0; j < (xCnt / 4); j++) {
							sb.append(patternA);
						}

						sb.append(patternB);

					}

				}
			} else if (rtn[i] == '.') {
				if (xCnt % 2 == 1) {
					sb.delete(0, sb.length());
					System.out.println(-1);
					return;
				} else if (xCnt % 4 == 0) {
					for (int j = 0; j < (xCnt / 4); j++) {
						sb.append(patternA);
					}
				} else if (xCnt % 4 == 2) {
					for (int j = 0; j < (xCnt / 4); j++) {
						sb.append(patternA);
					}

					sb.append(patternB);

				}
				xCnt = 0;
				sb.append(".");
			}
		}
		rtnStr = sb.toString();

		System.out.println(rtnStr);
	}
}
