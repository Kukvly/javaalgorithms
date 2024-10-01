package sv.silver_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9657 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println((n % 7 == 0 || n % 7 == 2) ? "CY" : "SK");
	}

}