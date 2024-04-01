package bz.bronze_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kukvly
 * 아파트 거주 조건
 * 1. a층의 b호에 살려면 자신의 아래 a-1층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다.
 * 2. 아파트에 빈 집은 없고, 모든 거주민이 이 조건을 지켜왔다.
 * 3. k층에 n호에는 몇 명이 살고 있는지 출력해라.
 * 4. 아파트는 0층부터 있고, 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 *
 */

public class B_2775 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		int k[] = new int[t];
		int n[] = new int[t];
		
		for(int i=0; i<t; i++) {
			k[i] = Integer.parseInt(br.readLine());
			n[i] = Integer.parseInt(br.readLine());
		}
	}

}
