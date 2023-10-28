package basealgorithms;

import java.util.Scanner;

public class base3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int card[] = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = input.nextInt();
		}

		int m = input.nextInt();
		int sep[] = new int[m];
		int tmp[] = new int[m];
		for (int i = 0; i < m; i++) {
			sep[i] = input.nextInt();
			tmp[i] = 0;
		
			for(int j = 0; j < card.length; j++)
			if(sep[i] == card[j]) {
				tmp[i] = 1;
			}
			System.out.print(tmp[i] + " ");
		}
	}
}
