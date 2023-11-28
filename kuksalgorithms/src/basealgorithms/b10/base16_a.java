package basealgorithms.b10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class base16_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 포켓몬의 수
        int m = Integer.parseInt(st.nextToken()); // 문제의 수

        Map<String, Integer> nameToNumber = new HashMap<>();
        Map<Integer, String> numberToName = new HashMap<>();

        // 포켓몬 정보 입력 및 매핑
        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNumber.put(name, i);
            numberToName.put(i, name);
        }

        // 문제에 따라 번호 또는 이름을 출력
        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            
            /*
             * String str = "김윤국"
             * str.charAt(0) -> str이 가리키고 있는 문자열에서 0번째 문자를 char 타입으로 변환 (출력시 "김" 출력)
             * 
             * Character.isDigit("a"): a가 숫자인지 확인 (숫자이면 true, 문자이면 false)
             * 
             * */ 
            
            if (Character.isDigit(query.charAt(0))) {
                // 번호로 조회
                int number = Integer.parseInt(query);
                System.out.println(numberToName.get(number));
            } else {
                // 이름으로 조회
                System.out.println(nameToNumber.get(query));
            }
        }
    }
}