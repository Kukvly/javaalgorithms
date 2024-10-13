package sv.silver_5;

/**
 * (x,y), (p,q)
 * x>p && y>q
 * 
 * A		 B
 * (56,177) (45,165)
 * 
 * 
 * C		 D
 * (45,181) (55,173)
 * 
 * 
 * n명 집단에서 각 사람의 덩치 등수는 자신보다 더 큰 덩치의 사람의 수로 정해짐
 * 만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1 됨
 * 
 * 등수를 결정하면 같은 덩치 등수를 가진 사람은 여러 명도 가능
 * 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int [n][2]; 		
			
		for (int i=0; i<n; i++) {
			String input[] = br.readLine().split(" ");
			arr [i][0] = Integer.parseInt(input[0]);
			arr [i][1] = Integer.parseInt(input[1]);
		}
		
		for (int i=0; i<n; i++) {
			int tmp = 1;
			for(int j=0; j<n; j++) {
				if(i==j) {
					continue;
				}
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					tmp++;
				}
			}
			System.out.print(tmp + " ");
		}
	}

}
