package references;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class primeFactorization {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("n: " + n);
		System.out.println("primeFctzn(" + n + "): " + primeFctzn(n));
		
	}

	public static Map<Integer, Integer> primeFctzn(int n) {
		Map<Integer, Integer> factors = new HashMap<>();

		for (int i = 2; i * i <= n; i++) {
			while (n % i == 0) {
				factors.put(i, factors.getOrDefault(i, 0) + 1);
				n /= i;
			}
		}

		if (n > 1) {
			factors.put(n, factors.getOrDefault(n, 0) + 1);
		}

		return factors;
	}

}
