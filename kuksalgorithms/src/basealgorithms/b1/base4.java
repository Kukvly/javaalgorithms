/**
 * 어떤 정수 X가 1보다 큰 제곱수로 나누어 떨어지지 않을 때, 그 수를 제곱ㄴㄴ수라고 한다.
 * 제곱수는 정수의 제곱이다.
 * min, max가 주어지면 min보다 크거나 같고, max보다 작거나 같은 제곱ㄴㄴ수가 몇 개 있는지 출력한다.
 * Input: 첫째 줄에 두 정수 min과 max가 주어진다.
 * Output: 첫째 줄에 min 보다 크거나 같고, max보다 작거나 같은 제곱ㄴㄴ수의 개수를 출력한다.
 * 1 ≤ min ≤ 1,000,000,000,000
 * min ≤ max ≤ min + 1,000,000
 */

package basealgorithms.b1;

import java.util.Scanner;

public class base4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//String input = scan.nextLine();
//		int min = Integer.parseInt(input);
//		int max = Integer.parseInt(input);
		int min = scan.nextInt();
		int max = scan.nextInt();
		int cnt = 0;
		int arr[] = new int[(max-min+1)];
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		
		// Math.sqrt(arr[i]),getClass()
		for(int i=1; i<arr.length; i++) {
			arr[0] = min; 
			arr[arr.length-1] = max;
			
			if(arr[i]<max) {
				arr[i] = arr[i-1] + 1;
				System.out.println("arr[" + i+"]: " + arr[i]);
			}
			
			System.out.println(Math.sqrt(arr[i]));
			
			if((Math.sqrt(arr[i-1])*(Math.sqrt(arr[i-1]))==arr[i-1])) {
				cnt++;
			}
			
		}
		System.out.println("cnt: " + cnt);
		System.out.println(arr.length - cnt);
		
//		System.out.println("int.class:" +int.class);
		
	}

}
