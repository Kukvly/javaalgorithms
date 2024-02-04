package bfsDfs;

/*결과
0 1 2 3 4 5 
0 5 1 4 3 2 
Process finished with exit code 0

결과가 아래가 다른 이유는 print 시점 때문
재귀는 탐색 시에 print하고 스택 시에는 stack에서 뺄 때 print함
중요한 것은 모든 것이 탐색 되느냐로 본다.
*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	    public static void main(String[] args){
	        Graph g = new Graph(6);
	        g.addEdge(0, 1); // 0 -> 1 연결
	        g.addEdge(0, 5); // 0 -> 5 연결
	        g.addEdge(1, 2); // 1 -> 2 연결
	        g.addEdge(1, 3); // 1 -> 3 연결
	        g.addEdge(1, 4); // 1 -> 4 연결
	        g.addEdge(2, 0); // 2 -> 0 연결
	        g.addEdge(3, 4); // 3 -> 4 연결
	        g.addEdge(4, 2); // 4 -> 2 연결

	        g.dfs();
	    }

	    private int v; // 정점의 개수
	    private LinkedList<Integer> adj[]; // 인접 리스트
	    public Graph(int v){
	        this.v = v;
	        this.adj = new LinkedList[v];
	        for(int i=0; i < v; i++){
	            adj[i] = new LinkedList<>();
	        }
	    }

	    // Source 정점에서 Dest 정점을 이어주는 메소드
	    public void addEdge(int s, int d){
	        this.adj[s].add(d);
	    }

	    // DFS를 수행하는 메소드
	    public void dfs(){
	        // 전체 정점이 최초에는 visited를 false 설정
	        boolean visited[] = new boolean[this.v];

	        // 반복문 기반으로 Disconnected Graph라도 전체 탐색이 가능
	        // 재귀 기반 DFS 수행 시작
	        for(int i=0; i < this.v; i++){
	            if(!visited[i]){
	                dfs_recurvise(i, visited);
	            }
	        }

	        System.out.println();

	        // 스택 기반 수행을 위해 다시 false로 초기화
	        visited = new boolean[this.v];

	        // 스택 기반 DFS 수행 시작
	        for(int i=0; i < this.v; i++){
	            if(!visited[i]){
	                dfs_stack(i, visited);
	            }
	        }
	    }

	    // DFS 재귀 수행 메소드
	    public void dfs_recurvise(int v, boolean visited[]){
	        visited[v] = true;
	        System.out.print(v + " ");

	        // 방문하지 않은 인접 정점을 모두 찾아 우선 탐색 수행
	        Iterator<Integer> i = this.adj[v].listIterator();
	        while(i.hasNext()){
	            int n = i.next();
	            if(!visited[n]){
	                dfs_recurvise(n, visited);
	            }
	        }
	    }

	    // DFS 스택 수행 메소드
	    public void dfs_stack(int start, boolean visited[]){
	        Stack<Integer> stack = new Stack<>();
	        stack.push(start);

	        while(!stack.isEmpty()){
	            int v = stack.pop();
	            System.out.print(v + " ");

	            // 방문하지 않은 인접 정점을 모두 찾아 우선 탐색 수행
	            Iterator<Integer> i = this.adj[v].listIterator();
	            while(i.hasNext()){
	                int n = i.next();
	                if(!visited[n]){
	                    visited[n] = true;
	                    stack.push(n);
	                }
	            }
	        }
	    }
	}