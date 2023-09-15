package basealgorithms;

import java.util.Scanner;

public class base5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = new int[2];
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input1 = br.readLine();
//		int a = Integer.parseInt(input1);
//		System.out.println(a);
//		

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("===============");
		
//		
//		arr[0] = a;
//		arr[1] = b;

		System.out.println(a);
		System.out.println(b);
		
		double rtn = 0;
		
		if((a>0 && a<10)|| (b>0 && b<10)) {
			rtn = div(a,b);
		};
		
		System.out.println(rtn);
	}
	
	public static double div(int a, int b) {
		double c = a;
		double d = b;
		return c/d;
	}

}
