package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * N x N 표
 * 모든 수는 자신의 한 칸 위에 있는 수보다 크다.
 * N번째 큰 수는?
 * 1 <= N <= 1500
 * -10억 <= 표 안에 수 <= 10
 * 
 * 정렬
 * 우선순위큐
 * */


public class B_2075 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] numArr = new long[n][n];
		List<Long> numList = new ArrayList<>();
			
		
		for(int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				numArr[i][j] = Long.parseLong(input[j]);
				numList.add(numArr[i][j]);
			}
		}
		
		Collections.sort(numList);
		System.out.println(numList.get((n*n-n)));
	}

}
