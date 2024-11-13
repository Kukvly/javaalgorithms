package sv.silver_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 1 <= m <= n <=8
 * 
 * */

public class B_15654 {
	static int n, m;
	static int selected[];
	static boolean visited[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static List<Integer> kuksList;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		
		// m만큼 input[] 한번더 입력
		
		selected = new int [m];
		visited = new boolean [n+1];
		
		input = br.readLine().split(" ");
		kuksList = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int param = Integer.parseInt(input[i]);
			kuksList.add(param);
		}
		
		Collections.sort(kuksList);
		
//		for (int i=0; i<kuksList.size(); i++) {
//			System.out.println(kuksList.get(i));
//		}
		
		backtracking(0);
		
		bw.flush();
	}
	
	public static void backtracking(int depth) throws IOException{
		if(depth == m) {
			for(int i=0; i<m; i++) {
				bw.write(String.valueOf(selected[i] + " "));
			}
			bw.write("\n");
			return;
		}
		
		for (int i=1; i<=n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				selected[depth] = kuksList.get(i-1);
				backtracking(depth+1);
				visited[i] = false;
			}
		}
	}

}
