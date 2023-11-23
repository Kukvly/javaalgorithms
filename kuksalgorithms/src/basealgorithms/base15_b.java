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
import java.util.*;

public class base15_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 로그의 수

        Set<String> employees = new HashSet<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if ("enter".equals(status)) {
                employees.add(name); // 입실한 경우 집합에 추가
            } else if ("leave".equals(status)) {
                employees.remove(name); // 퇴실한 경우 집합에서 제거
            }
        }

        // 최종적으로 남아있는 사람들을 정렬하여 출력
        List<String> sortedEmployees = new ArrayList<>(employees);
        Collections.sort(sortedEmployees, Collections.reverseOrder());

        for (String employee : sortedEmployees) {
            System.out.println(employee);
        }
    }
}
