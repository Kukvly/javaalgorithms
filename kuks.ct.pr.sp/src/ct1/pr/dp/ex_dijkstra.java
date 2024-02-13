package ct1.pr.dp;

// 다익스트라 알고리즘은 DP를 이용했다는 점에서 간결하다.
// O(N^2)의 시간 복잡도

public class ex_dijkstra {
	public static int n = 6;
	public static int INF = 10000000;
	public static boolean v[] = new boolean[n]; // 방문한 노드
	public static int d[] = new int[n];		  // 거리
	public static int[][] arr = {
			{0, 2, 5, 1, INF, INF},
			{2, 0, 3, 2, INF, INF},
			{5, 3, 0, 3, 1, 5},
			{1, 2, 3, 0, 1, INF},
			{INF, INF, 1, 1, 0, 2},
			{INF, INF, 5, INF, 2, 0}
		};
	public static void main(String[] args) {
		
		dijkstra(0);
		for(int i=0; i<n; i++) {
			System.out.println(d[i]);
		}
	}
	public static int getSmallIndex() {
		int min = INF;
		int index = 0;
		for(int i=0; i<n; i++) {
			if(d[i]<min && !v[i]) {
				min = d[i];
				index = i;
			}
		}
		
		return index;
	}
	
	public static void dijkstra(int start) {
		for(int i=0; i<n; i++) {
			d[i] = arr[start][i];
		}
		v[start] = true;
		for(int i=0; i<n-2; i++) {
			int current = getSmallIndex();
			v[current] = true;
			for(int j=0; j<6; j++) {
				if(!v[j]) {
					if(d[current] + arr[current][j] < d[j]) {
						d[j] = d[current] + arr[current][j];
					}
				}
			}
		}
	}

}
