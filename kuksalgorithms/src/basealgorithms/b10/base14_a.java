package basealgorithms.b10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

/*
 * 입력으로 문자열 집합의 크기 N과 비교할 문자열의 개수 M을 받은 후, 문자열 집합을 HashSet에 저장하고,
 * 비교할 문자열들을 입력받아 HashSet에 속하는지 확인하여 개수를 출력합니다.
 * 
 * */

public class base14_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력으로 문자열 집합의 크기 N과 비교할 문자열의 개수 M을 받음
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        // 문자열 집합을 저장할 HashSet 생성
        HashSet<String> stringSet = new HashSet<>();

        // 문자열 집합에 문자열들을 추가
        for (int i = 0; i < n; i++) {
            stringSet.add(br.readLine());
        }

        // 비교할 문자열들 중 문자열 집합에 속하는 것의 개수를 구함
        int count = 0;
        for (int i = 0; i < m; i++) {
            String target = br.readLine();
            if (stringSet.contains(target)) {
                count++;
            }
        }

        System.out.println(count);
    }
}








