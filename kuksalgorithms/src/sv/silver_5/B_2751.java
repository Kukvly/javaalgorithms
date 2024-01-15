package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_2751 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> numList = new ArrayList<Integer>();
		for (int i=0; i<n; i++) {
			numList.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(numList);
		for(int i=0; i<n; i++) {
			System.out.println(numList.get(i));
		}
	}
}
