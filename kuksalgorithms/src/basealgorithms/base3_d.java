package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashSet;

public class base3_d {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> cardSet = new HashSet<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            cardSet.add(Integer.parseInt(st.nextToken()));
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (cardSet.contains(num)) {
                result.append("1 ");
            } else {
                result.append("0 ");
            }
        }
        
        System.out.println(result);
    }
}
