package basealgorithms;

/**
 * @author kukvly
 * 
 *         [1764] 듣도 못한 사람 수: N 보도 못한 사람 수: M
 * 
 *         input n m n1 n2 n3 m1 m2 m3 m4
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class base18_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 듣도 못한 사람의 수 N과 보도 못한 사람의 수 M 입력
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // 듣도 못한 사람의 명단을 저장할 Set
        HashSet<String> unheard = new HashSet<>();

        // 듣도 못한 사람의 명단 입력
        for (int i = 0; i < N; i++) {
            unheard.add(br.readLine());
        }

        // 보도 못한 사람 중에서 듣도 못한 사람과 겹치는 사람 찾기
        List<String> result = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (unheard.contains(name)) {
                result.add(name);
            }
        }

        // 겹치는 사람의 수와 명단 출력
        Collections.sort(result);
        System.out.println(result.size());
        for (String name : result) {
            System.out.println(name);
        }
    }
}