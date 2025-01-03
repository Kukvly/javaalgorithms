package sv.silver_5;

public class B_4673 {
	public static boolean arr[] = new boolean [10001];
	public static void main(String[] args) {

		for(int i=1; i<=10000; i++) {
			int dn = d(i);
			if(dn<=10000) {
				arr[dn] = true;
			}
		}
		
		for(int i=1; i<=10000; i++) {
			if(!arr[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int sum = n;
		
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		
		return sum;
	}

}
