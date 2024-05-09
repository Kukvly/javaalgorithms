package sv.silver_2;

/**
 * input
 * w h -> 첫째줄
 * h개 줄의 지도 (1=땅, 0=바다)
 * 입력 맨 마지막엔 두 개의 0
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4963 {
	
	static int w,h;
	
	static int arr[][];
	
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {1, 0, -1, 0};
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		String input[] = br.readLine().split(" ");

		w = Integer.parseInt(input[0]);
		h = Integer.parseInt(input[1]);
		
		while(w!=0 && h!=0) {
			arr = new int[w][h];
			for (int i=0; i<w; i++) {
				input = br.readLine().split(" ");
				for(int j=0; j<h; j++) {
					arr[i][j] = Integer.parseInt(input[j]);
				}
			}
			
			// logic 구현부
			
			dfs();
			
			//
			
			input = br.readLine().split(" ");
			w = Integer.parseInt(input[0]);
			h = Integer.parseInt(input[1]);
				
		}
		
		
	}
	
	public static void dfs(int start) {
		
	}

}
