package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B_2075_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐를 사용하여 최소 힙 구현
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 한 줄씩 입력받아 우선순위 큐에 추가
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());
                pq.offer(num);

                // 큐의 크기를 N으로 유지하면서 가장 작은 수부터 제거
                if (pq.size() > N) {
                    pq.poll();
                }
            }
        }

        // 큐의 가장 위에 있는 원소가 N번째로 큰 수
        System.out.println(pq.poll());

        br.close();
    }
}