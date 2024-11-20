package sv.silver_4;

import java.io.*;

public class B_9372 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int x = 0; x < t; x++) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]); // 국가(노드) 수
            int m = Integer.parseInt(input[1]); // 비행기(간선) 수

            // 간선 정보 입력 (입력은 받지만 사용하지 않아도 무방)
            for (int i = 0; i < m; i++) {
                br.readLine(); // 간선 정보는 단순히 입력만 받음
            }

            // 연결된 그래프의 최소 간선 수는 항상 노드 수 - 1
            bw.write((n - 1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
