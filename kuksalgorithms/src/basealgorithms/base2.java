package basealgorithms;

import java.util.Scanner;

public class base2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		int rtn = 0;
		
		if((-10000<=x1 && x1<=10000) && (-10000<=y1 && y1<=10000)
				&& (-10000<=x2 && x2<=10000) && (-10000<=y2 && y2<=10000)
				&& (-10000<=r1 && r1<=10000) && (-10000<=r2 && r2<=10000)){
			if((r1+r2)== Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2))) {
				System.out.println("(x1, y1): " + "(" + x1 + ", " + y1 + ")");
				System.out.println("(x2, y2): " + "(" + x2 + ", " + y2 + ")");
			} else  {
				
			}
		}
	}

}
