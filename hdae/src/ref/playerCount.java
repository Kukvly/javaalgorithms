package ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class playerCount {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		// 플레이어 번호 카운트 맵
		Map<Integer, Integer> cntMap = new HashMap<>();
		
		for (int i=0; i<n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			// 맵에 해당 번호를 카운트하여 저장
			cntMap.put(num, cntMap.getOrDefault(num, 0) + 1);
		}
		
		// 모든 라운드에서 모든 플레이어가 자신의 번호와 같은 번호를 외치는지 확인
		boolean possible = true;
		for(int cnt : cntMap.values()) {
			if(cnt != n) {
				possible = false;
				break;
			}
		}
		
		// 결과 출력
		if(possible) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
