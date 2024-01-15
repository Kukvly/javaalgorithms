package sv.silver_5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int numArr[] = new int[n];
				
		for (int i=0; i<n; i++) {
			numArr[i]=(Integer.parseInt(br.readLine()));
		}
		
		Arrays.sort(numArr);
		
		for (int i=0; i<n; i++) {
			bw.write(numArr[i]+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
