package references;

public class gcd_lcm {

	public static void main(String[] args) {
		int n = 30;
		int m = 45;
		
		int gcd = kuksGcd(n, m);
		int lcm = (n * m)/gcd;
		
		System.out.println("최대 공약수: " + gcd);
		System.out.println("최소 공배수: " + lcm);

	}
	
	public static int kuksGcd(int n, int m) {
		if(n%m==0) {
			return m;
		}
		return kuksGcd(m, n%m);
	}

}
