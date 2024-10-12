package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1316 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            if (isGroupWord(str)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    // 그룹 단어인지 확인하는 함수
    public static boolean isGroupWord(String str) {
        boolean[] seen = new boolean[26];  // 알파벳 26글자를 확인하기 위한 배열
        char prev = 0;

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != prev) {  // 연속된 문자가 아니라면
                if (seen[current - 'a']) {  // 이미 나온 문자면 그룹 단어가 아님
                    return false;
                }
                seen[current - 'a'] = true;  // 문자를 본 것으로 표시
            }
            prev = current;  // 이전 문자를 현재 문자로 업데이트
        }
        return true;
    }

}
