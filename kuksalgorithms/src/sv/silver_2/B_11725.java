package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B_11725 {

	static int n;
	static int arr[][];
	static boolean visited[];
	static Map<Integer, Integer> kuksMap;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		kuksMap = new HashMap<>();
		for (int i=1; i<=n-1; i++) {
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
		
			arr[a][b] = arr[b][a] = 1;
		}
		
		dfs(1);
		
		for(int i=2; i<=n; i++) {
			System.out.println(kuksMap.get(i));
		}
	}

	public static void dfs(int start) {
		visited[start] = true;
//		System.out.println(start);
		
		for (int i=1; i<=n; i++) {
				if(arr[start][i]==1 && !visited[i]) {
					kuksMap.put(i, start);
					dfs(i);
			}
		}
	}
}
