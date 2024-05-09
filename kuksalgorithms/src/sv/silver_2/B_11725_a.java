package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B_11725_a {

	static int n;
//	static int arr[][];
	static List<List<Integer>> kuksList;
	static boolean visited[];
	static Map<Integer, Integer> kuksMap;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		visited = new boolean[n+1];
		kuksMap = new HashMap<>();
		

//		arr = new int[n+1][n+1];
		kuksList = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			kuksList.add(new ArrayList<>());
		}
		
		for (int i=1; i<=n-1; i++) {
			String input[] = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
		
			kuksList.get(a).add(b);
			kuksList.get(b).add(a);
		}
		
		dfs(1);
		
		for(int i=2; i<=n; i++) {
			System.out.println(kuksMap.get(i));
		}
	}

	public static void dfs(int start) {
		visited[start] = true;
		
		for (int i : kuksList.get(start)) {
				if(!visited[i]) {
					kuksMap.put(i, start);
					dfs(i);
			}
		}
	}
}
