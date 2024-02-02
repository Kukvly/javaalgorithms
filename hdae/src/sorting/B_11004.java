package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_11004 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int k = Integer.parseInt(input[1]);
		
		List<Integer> numList = new ArrayList<Integer>();
		
		input = br.readLine().split(" ");

		for (int i=0; i<n; i++) {
			numList.add(Integer.parseInt(input[i]));
		}
		
		Collections.sort(numList);
		
		System.out.println(numList.get(k-1));
		
		
	}

}
