package references;

import java.util.Scanner;

public class StringBuilder_sc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<=a; i++) {
			sb.append(i+"\n");
			System.out.println(i);
		}
	}

}
