package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bubble {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		

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
