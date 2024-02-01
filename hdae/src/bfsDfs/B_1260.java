package bfsDfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하시오.
 * 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
 * 더 이상 방문할 수 있는 점이 없는 경우 종료한다.
 * 정점 번호는 1 ~ N 까지
 * 
 * input
 * 첫째 줄에 정점 개수 N, 간선 개수 M, 탐색 시작 정점 V
 * 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호
 * 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
 * 입력으로 주어지는 간선은 양방향이다.
 * 
 * 4 5 1
 * 1 2
 * 1 3
 * 1 4
 * 2 4
 * 3 4
 * 
 * output
 * 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다.
 * V부터 방문된 점을 순서대로 출력하면 된다.
 * 
 * 1 2 4 3
 * 1 2 3 4
 *
 *
 *
 */

public class B_1260 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
}
