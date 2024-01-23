package references;

public class sosu {

	public static void main(String[] args) {
		int n = 5;
		if (sosu(n)) {
			System.out.print("sosu");
		} else {
			System.out.print("not sosu");
		}
	}

	public static Boolean sosu(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i < n; i++) {
			if (n % 2 == 0)
				return false;
		}
		return true;
	}

}
