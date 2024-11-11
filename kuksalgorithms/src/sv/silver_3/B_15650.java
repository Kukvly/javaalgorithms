package sv.silver_3;

/**
 * 1 <= m <= n <= 8
 * 
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 
 * 중복되는 수열을 여러 번 출력하면 안되며,
 * 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * 
 * # key
 * 1. 중복 없이 순열 생성 -> 방문한 숫자는 다시 선택할 수 없도록 처리
 * 2. 백트래킹을 이용한 탐색 -> 현재까지 선택한 숫자 저장하고, M개의 숫자를 고르면 그 결과 출력
 * 3. 재귀를 통해 순열 탐색
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_15650 {

	static int n, m;
	static int selected[]; // 선택된 숫자 저장하는 배열
	static boolean visited[]; // 숫자 선택 여부 기록 배열
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		n = Integer.parseInt(input[0]);
		m = Integer.parseInt(input[1]);
		
		selected = new int[m]; // 선택된 숫자 저장
		visited = new boolean[n+1]; // 1부터 n까지 숫자 방문 여부 체크
		
		backtracking(1, 0); // depth 0부터 백트래킹 시작
	}
	
	public static void backtracking(int start, int depth) {

		if(depth == m) {
			for(int i=0; i<m; i++) {
				System.out.print(selected[i] + " ");
			}
			System.out.println();
			return;
		}
		
		// 1부터 n까지 숫자에 대한 순열 생성
		for(int i=start; i<=n; i++) {
			if(!visited[i]) { // 선택된 숫자는 건너뜀
				visited[i] = true; // 숫자 선택
				selected[depth] = i; // 현재 자리에 숫자 i 저장
				backtracking(i+1, depth+1); // 다음 깊이 탐색
				visited[i] = false; // 백트래킹, 숫자 i를 다시 사용할 수 있도록 설정
			}
		}
	}
}




