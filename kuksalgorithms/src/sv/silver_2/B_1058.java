package sv.silver_2;

/**
 * 
 * 2-친구: A가 B의 2-친구 하려면 A,B가 서로 친구거나  A,B 모두의 친구인 C가 있어야 함
 * 
 * 
 * A와 B가 친구면 B와 A도 친구이고,
 * A와 A는 친구가 아니다.
 * 
 * 가장 유명한 사람 -> 2-친구가 많은 사람
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1058 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		char[][] arr = new char[n][n];
		
		for(int i=0; i<n; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		System.out.println(cntTwoFrd(n, arr));
		
	}
	
	public static int cntTwoFrd(int n, char[][] arr) {
		int max = 0;
		
		for (int i=0; i<n; i++) {
			boolean[] visited = new boolean[n];
			int cnt = 0;
			for(int j=0; j<n; j++) {
				if(i != j && (arr[i][j]=='Y')|| hasMutualFrd(i, j, arr)) {
					if(!visited[j]) {
						visited[j] = true;
						cnt++;
					}
				}
			}
			
			max = Math.max(max, cnt);
		}
		return max;
	}
	
	public static boolean hasMutualFrd(int i, int j, char[][] arr) {
		int n = arr.length;
		
		for(int k=0; k<n; k++) {
			if(k!=i && k!=j && arr[i][k] == 'Y' && arr[k][j] == 'Y') {
				return true;
			}
		}
		
		return false;
	}

}
