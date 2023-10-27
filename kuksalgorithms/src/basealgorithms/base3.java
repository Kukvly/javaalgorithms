package basealgorithms;

/**
 * <피보나치 함수 규칙>
 * fibonacci(n) = fibonacci(n-2) + fibonacci(n-1)
 * Cnt0: 1 0 1 1 2 3 5 
 * Cnt1; 0 1 1 2 3 5 8
 * 
 * 가진 숫자 개수
 * 가진 숫자 목록
 * 숫자 더미 개수
 * 숫자 더미 목록
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import java.util.Scanner;

public class base3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int card[] = new int[n];
		for (int i = 0; i < n; i++) {
			card[i] = input.nextInt();
		}
		
		for(int x=0; x<card.length ;x++) {
			System.out.print("card["+x+"]: " + card[x] + ", ");
		}
		System.out.println("");
		
		int m = input.nextInt();
		int sep[] = new int[m];
		for (int i = 0; i < m; i++) {
			sep[i] = input.nextInt();
			System.out.println("sep["+i+"]: " + sep[i] + ", ");	
			for (int j = 0; j < n; j++) {
				if (sep[i] == card[j]) {
					sep[i] = 1;
					System.out.println("안타나?");
				} else {
					sep[i] = 0;
				}
			}
			System.out.println("");	
			System.out.print(sep[i] + " ");
		}
	}

}
