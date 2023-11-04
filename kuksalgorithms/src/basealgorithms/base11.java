package basealgorithms;

import java.util.Scanner;

public class base11 {
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int prd(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static int rst(int a, int b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		System.out.println(add(x, y));
		System.out.println(sub(x, y));
		System.out.println(prd(x, y));
		System.out.println(div(x, y));
		System.out.println(rst(x, y));
	}
}
