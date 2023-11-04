package basealgorithms;

/*
 * (세 자리 수) × (세 자리 수) 연산
 * */

import java.util.Scanner;

public class base12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		System.out.println((b%10)*a);
		System.out.println(((b%100 - b%10)*a)/10);
		System.out.println(((b-(b%100))*a)/100);
		System.out.println(a*b);
	}
}
