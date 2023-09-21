/**
 * 수열의 합
 * N: 합
 * L: 길이가 적어도 L
 * 가장 짧은 연속된 음이 아닌 정수 리스트 출력
 * N <= 1000000000, 2<=L<=100 [N, L 자연수]
 * 만약 리스트의 길이가 100보다 작거나 같으면, 
 * 연속된 수를 첫째 줄에 공백으로 구분하여 출력한다. 
 * 만약 길이가 100보다 크거나 그러한 수열이 없을 때는 -1을 출력한다.
 */


/**
 * 총합: n
 * 길이: l
 * 
 * 숫자 갯수가 홀수일때
 * l % (l/2) = 0
 * 
 * 
 * 숫자 갯수가 짝수일때
 * 가운데수 = (n/l)
 * 
 * 
 */


package basealgorithms;

import java.util.Scanner;

public class base7 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int l = input.nextInt();

		int sum=0;
		
		int nList[] = new int[n];
		
		if((l>=2 && l<=100)&& (n<=1000000000)) {
			for(int i=0; i<100; i++) {
				if
			}
		} 
//		else if(l>100 || 값x) {
//			sum = -1;
//			System.out.println(sum);
//		}
		
		
	}

}
