package sv.silver_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_15652 {
	static int n, m;
	static int selected[];
	static boolean visited[];
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		
		selected = new int [m];
		visited = new boolean [n+1];
		
		backtracking(1,0);
		
		bw.flush();
	}
	
	public static void backtracking(int start, int depth) throws IOException{
		if(depth == m) {
			for(int i=0; i<m; i++) {
				bw.write(String.valueOf(selected[i] + " "));
			}
			bw.write("\n");
			return;
		}
		
		for(int i=start; i<=n; i++) {
//			if(!visited[i]) {
//				visited[i] = true;
//			if(selected[i]<selected[depth]) {
				selected[depth] = i;
				backtracking(i, depth+1);
//				visited[i] = false;
//			}
		}
	}

}
