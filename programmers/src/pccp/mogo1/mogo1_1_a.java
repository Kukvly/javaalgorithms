package pccp.mogo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class mogo1_1_a {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(solution(input));
    }

    public static String solution(String input_string) {
        Map<Character, Integer> segmentCount = new HashMap<>();  // 각 문자별 연속 구간 수를 저장
        Set<Character> loneAlphabets = new TreeSet<>();          // 외톨이 알파벳을 알파벳 순으로 정렬하기 위한 TreeSet
        int len = input_string.length();
        
        // 문자열 순회하며 연속 구간 수를 체크
        for (int i = 0; i < len; i++) {
            char currentChar = input_string.charAt(i);
            // 현재 문자가 첫 번째 등장하는 경우 segmentCount에 추가
            if (!segmentCount.containsKey(currentChar)) {
                segmentCount.put(currentChar, 1);
            }
            // 연속 구간이 끝나는 지점에서 구간 수를 증가
            else if (i > 0 && input_string.charAt(i - 1) != currentChar) {
                segmentCount.put(currentChar, segmentCount.get(currentChar) + 1);
            }
        }

        // 외톨이 알파벳 판별: 연속 구간 수가 2 이상인 문자만 추출
        for (Map.Entry<Character, Integer> entry : segmentCount.entrySet()) {
            if (entry.getValue() > 1) {
                loneAlphabets.add(entry.getKey());
            }
        }

        // 외톨이 알파벳이 없다면 "N"을 반환
        if (loneAlphabets.isEmpty()) {
            return "N";
        }

        // 외톨이 알파벳을 알파벳 순서로 결합하여 반환
        StringBuilder answer = new StringBuilder();
        for (Character ch : loneAlphabets) {
            answer.append(ch);
        }

        return answer.toString();
    }
}
