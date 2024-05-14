package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_11581_a {

	static List<List<Integer>> kuksList;
	static boolean visited[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 교차로 수
		
		kuksList = new ArrayList<>();
		
		visited = new boolean[n+1][n+1];
		
		for(int i=1; i<=n-1; i++) {
			int m = Integer.parseInt(br.readLine()); // 1번 교차로와 연결된 수
			String input[] = br.readLine().split(" ");
			for(int j=1; j<=m; j++) {
				kuksList.get(i).add(Integer.parseInt(input[j-1]));
			}
			
			for (int j=0; j<m; j++) {
				int 
			}
		}
		
		
	}

}
