package datastructurepr;

import java.util.Scanner;

public class Dspr1_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int card[] = new int[n];

		for (int i = 0; i < n; i++) {
			card[i] = input.nextInt();
		}

		int m = input.nextInt();

		int sep[] = new int[m];

		int temp[] = new int[m];

		for (int i = 0; i < m; i++) {
			sep[i] = input.nextInt();
			temp[i] = 0;
			for (int j = 0; j < n; j++) {
				if (sep[i] == card[j]) {
					temp[i] = 1;
				}
			}
			System.out.print(temp[i] + " ");
		}
	}

}
