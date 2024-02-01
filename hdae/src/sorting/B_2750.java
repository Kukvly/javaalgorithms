package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_2750 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

//		int numArr[] = new int[n];
		List<Integer> numList = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
//			numArr[i] 
			numList.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(numList);
		for (int i=0; i<numList.size(); i++) {
			System.out.println(numList.get(i));;
		}
	}

}
