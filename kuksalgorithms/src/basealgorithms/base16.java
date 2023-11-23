package basealgorithms;

/**
 * [1620]
 * 첫째 줄 입력1: 도감에 수록되어 있는 포켓몬의 개수 n
 * 첫째 줄 입력2: 도감에서 내가 맞춰야할 문제의 개수 M
 * 1 <= N,M < 100000
 * 
 * pocketmon.length = n
 * 첫글자만 대문자이거나, 마지막만 대문자
 * 포켓몬 이름의 최대 길이: 20, 포켓몬 이름의 최소 길이: 2
 * 
 * 문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야 함
 * ex. chew -> 1, 1 -> chew
 * 
 * 입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같고,
 * 입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어짐
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class base16 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        System.out.print(n);
        System.out.print(m);
        
        String pocketmon[] = new String[n];
        
        Map<String, Object> paramMap = new HashMap<>();
        
        for(int i=0; i<n; i++) {
        	pocketmon[i] = br.readLine();
        	System.out.println("pocketmon["+i+"]:" + pocketmon[i]);
        }
        
	}
}
