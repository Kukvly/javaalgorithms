package sv.silver_4;

/**
 * 제일 위에 있는 카드를 바닥에 버린다.
 * 
 * 그 다음, 제일 위에 있는 카드를 제일 아래에 있는
 * 카드 밑으로 옮긴다.
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_2164 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n; i++) {
			queue.add(i);
		}
		
		for(int i=0; i<n; i++) {
			
			if(queue.size() > 1) {
				queue.remove();
				queue.add(queue.remove());
			}
			if(queue.size()==1) {
				System.out.println(queue.peek());
				return;
			}
		}
	}

}
