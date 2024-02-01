package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B_2693 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		
		
		for (int i=0; i<t; i++) {
			String input[] = br.readLine().split(" ");
			List<Integer> numList = new ArrayList<Integer>();
			for (int j=0; j<10; j++) {
				numList.add(Integer.parseInt(input[j]));
			}
			
			Collections.sort(numList);
			System.out.println(numList.get(7));
		}
	}

}
