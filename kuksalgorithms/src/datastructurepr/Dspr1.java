package datastructurepr;
import java.util.Scanner;

/**
 * @author kukvly
 * 숫자 카드는 정수 하나가 적혀져 있는 카드이다. 윤국이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때,
 * 이 수가 적혀있는 숫자카드를 윤국이가 갖고 있는지 아닌지 구하는 프로그램을 작성하시오.
 * 1. 숫자 카드 개수 N(1<= N <= 500000)
 * 2. 숫자 카드에 적혀 있는 정수 [-10000000 ~ 10000000]
 * 3. M (1<= M <= 500000)
 * 4. 윤국이가 갖고 있는 숫자 카드인지 아닌지 구해야 할 M개의 정수가 주어짐
 * (M은 공백으로 구분되어져 있음 [-10000000 ~ 10000000])
 */

public class Dspr1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int card[] = new int[n];
		
		for (int i=0; i<n; i++) {
			card[i] = input.nextInt();
			System.out.println("card[" + i + "]: " + card[i]);
		}
		
		int m = input.nextInt();
		
		int sep[] = new int[m];
		
		int temp[] = new int[m];
		
		for (int i=0; i<m; i++) {
			sep[i] = input.nextInt();
			temp[i] = 0;
			System.out.print(sep[i]+" ");
			System.out.print(temp[i]+" ");		
		}
		System.out.println("");
		System.out.println("n: " + n);
		
	
		
		
		
//		for(i)
		
		
		
	}

}
