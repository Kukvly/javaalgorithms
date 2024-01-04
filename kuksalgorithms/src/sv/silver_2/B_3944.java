package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 
 *         나머지 계산
 * 
 *         input t: 테스트 케이스의 개수 t개의 (b진법 d) 2<=b<=10 d<=10,000,000
 * 
 *         output t개의 b진법수 d를 (b-1)로 나눈 나머지 출력
 */

public class B_3944 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String input[] = null;

		int b = 0;
		long d = 0;
//		int tmpArr[] = new int[24];

		int tmpD = 0;

		for (int i = 0; i < t; i++) {
			input = br.readLine().split(" ");
			b = Integer.parseInt(input[0]);
			d = Long.parseLong(input[1]);

			if(b==10) {
				System.out.println(d%(b-1));
			}else {
				int tmpArr[] = new int[b];
				char[] tmpArrD = (input[1]).toCharArray();
				System.out.println("kuks chk ------------start");
				System.out.println(input[1]);
				System.out.println("kuks chk --------------ing");
				System.out.println("tmpArrD.length: "+tmpArrD.length);
				for (int x = 0; x < tmpArrD.length; x++) {
					System.out.println(tmpArrD[x]);
				}
				System.out.println("kuks chk --------------end");
				
				int tmpSum = 0;
				for (int j = 0; j < tmpArrD.length; j++) {
					tmpArr[j] = Character.getNumericValue(tmpArrD[j]) * (int) (Math.pow(b, tmpArrD.length-j));
					System.out.println("tmpArr["+j+"]: " + tmpArr[j]);
					tmpSum += tmpArr[j];
				}
				System.out.println(tmpSum);
				tmpD = tmpSum % (b - 1);
				System.out.println("answer: "+tmpD);

//				 tmpD = 각 자리수마다 b의 자리수인덱스 승을 곱해서 더한 수

			}
			
			
		}
	}

}
