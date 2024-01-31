package numTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sosu {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(n+" is sosu?");
		
		if (sosu(n)) {
			System.out.print("sosu");
		} else {
			System.out.print("not sosu");
		}
	}

	public static Boolean sosu(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
