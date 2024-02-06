package kuks.test.practice.dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 
 * @author kukvly
 * 최단 경로 (Dijkstra)
 * 
 * 1. 출발 노드 설정
 * 2. 출발 노드 기준으로 각 노드의 최소 비용 저장
 * 3. 방문하지 않은 노드 중에서 가장 비용이 적은 노드 선택
 * 4. 해당 노드를 거쳐서 특정한 노드로 가는 경우를 고려하여 최소 비용 갱신
 * 
 * 5. 3~4 반복
 * 
 * input
 * v: 정점의 개수 (1 <= v <= 20,000)
 * e: 간선의 개수 (1 <= e <= 300,000)
 * 
 * 모든 정점에 1 ~ v 까지 번호가 적혀있음
 * 
 * 첫째 줄에 v e 
 * 둘째 줄에 시작 정점 번호 k (1 <= k <= v)
 * 셋째 줄부터 e개 만큼
 * u v w (w는 가중치)
 * 
 * u에서 v로 가는 가중치 w인 간선이 존재한다는 의미
 * u != v, (w<=10, 자연수)
 * 서로 다른 두 정점 사이에 여러 개의 간선이 존재할 수도 있음
 * 
 * output
 * 첫째 줄부터 v개의 줄에 걸쳐, i번째 줄에 i번 정점으로의 최단 경로의 경로값 출력
 * 시작점 자신은 0으로 출력, 경로가 존재하지 않으면 INF 출력
 * 
 */

public class B_1753_shortestPath {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input[] = br.readLine().split(" ");
		
		int v = Integer.parseInt(input[0]);

		int e = Integer.parseInt(input[1]);
		
		int k = Integer.parseInt(br.readLine());
		
		for(int i=0; i<e; i++) {
			input = br.readLine().split(" ");
		}
		
		bw.close();
		
	}

}
