package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B_24479_a {

    static int n,m,r,cnt;
    //몇번째 방문인지 
    public static int[] visted;
    //연결된 노드
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
 
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        r = Integer.parseInt(input[2]);
        
        //연결된 노드 초기화
        for(int i=0;i<n+1;i++){
            graph.add(new ArrayList<Integer>());
        }
        
        //연결된 노드 체크
        for(int i=0;i<m;i++){
			input = br.readLine().split(" ");
			int u = Integer.parseInt(input[0]);
			int v = Integer.parseInt(input[1]);
            
			// arr[u][v] = arr[v][u] = 1
			graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        visted= new int[n+1];
        
        
        //노드마다 오름차순
        for(int i=0;i<graph.size();i++){
            Collections.sort(graph.get(i));
        }
        cnt=1;
        dfs(r);
        for(int i=0;i<visted.length;i++){
            if(i!=0) System.out.println(visted[i]);
        }
    }
    
  //dfs 
    public static void dfs(int start){
    	//순차 정함 
        visted[start]=cnt;
        for(int i=0;i<graph.get(start).size();i++){
        	//연결된 노드
            int y = graph.get(start).get(i);
            //방문을 안했을 경우
            if(visted[y]==0){
            	//순차 증가
                cnt++;
                //dfs 실행
                dfs(y);
            }
        }
    }
}