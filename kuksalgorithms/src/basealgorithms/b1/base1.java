package basealgorithms.b1;

import java.util.Scanner;

public class base1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>0 && b<10) {
			System.out.println(a+b);
		}
	}

}
