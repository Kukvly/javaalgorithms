package basealgorithms;

/**
 * 7785
 * 첫째 줄: 출입 기록 수 n
 * 
 * 1<name.length < 6
 * 동명이인 없음
 * 
 * leave: 출
 * enter: 입
 * 
 * ex.
 * 4
 * Baha enter
 * Askar enter
 * Baha leave
 * Artem enter
 * 
 * Askar 회사에 있음
 * Artem 회사에 있음
 * 
 * 공백으로 구분해서 공백 앞에 있는 자리수만 name 배열에 따로 저장
 * 
 * 
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class base15_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Set<String> presentEmployees = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if (status.equals("enter")) {
                presentEmployees.add(name);
            } else {
                presentEmployees.remove(name);
            }
        }

        // 남아 있는 사람들을 사전 순으로 정렬하여 출력
        String[] result = presentEmployees.toArray(new String[0]);
        for (int i = result.length - 1; i >= 0; i--) {
            System.out.println(result[i]);
        }
    }
}
