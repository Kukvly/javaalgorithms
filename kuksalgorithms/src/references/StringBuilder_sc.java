package references;

import java.util.Scanner;

public class StringBuilder_sc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<=a; i++) {
			sb.append(i);
			System.out.println("i_"+i);
			System.out.println("sb_"+sb);
		}
	}

}
