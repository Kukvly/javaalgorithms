package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 자연수 A를 B번 곱한 수 구하기
 * 단, A^B를 C로 나눈 나머지를 구하는 프로그램을 작성
 * 
 * A, B, C <= 2,147,483,647
 * input
 * A B C
 * 
 * output
 * A를 B번 곱한 수를 C로 나눈 나머지 출력
 */

public class B_1629 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		long a = Long.parseLong(input[0]);
		long b = Long.parseLong(input[1]);
		long c = Long.parseLong(input[2]);
		
		System.out.println((long)(Math.pow(a, b)%c));
	}
}
