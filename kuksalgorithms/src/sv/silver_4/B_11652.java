package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B_11652 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<Long, Integer> cardMap = new HashMap<>();
		long num = 0;
		int cntMax = 0;
		
		for(int i=0; i<n; i++) {
			long card = Long.parseLong(br.readLine());
			cardMap.put(card, cardMap.getOrDefault(card, 0)+1);
			
			int cnt = cardMap.get(card);
		
			if(cnt>cntMax || (cnt==cntMax && card < num)) {
				cntMax = cnt;
				num = card;
			}
		}
		
		System.out.println(num);

	}

}
