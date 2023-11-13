package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 총 N개의 문자열로 이루어진 집합 S
 * 입력으로 주어지는 M개의 문자열 중에서 집합 S에 포함되어 있는 것이 총 몇 개인지 구하는 프로그램 작성
 * 
 * [Input]
 * 첫째 줄에 문자열의 개수 N과 M (1 ≤ N ≤ 10,000, 1 ≤ M ≤ 10,000)이 주어진다. 
 * 다음 N개의 줄에는 집합 S에 포함되어 있는 문자열들이 주어진다.
 * 다음 M개의 줄에는 검사해야 하는 문자열들이 주어진다.
 * 입력으로 주어지는 문자열은 알파벳 소문자로만 이루어져 있으며, 길이는 500을 넘지 않는다. 집합 S에 같은 문자열이 여러 번 주어지는 경우는 없다.
 * 
 * 
 * [Output]
 * 첫째 줄에 M개의 문자열 중에 총 몇 개가 집합 S에 포함되어 있는지 출력
 * 
 * 5 11
 * 
 * N: 5
 * baekjoononlinejudge
 * startlink
 * codeplus
 * sundaycoding
 * codingsh
 * 
 * M: 11
 * baekjoon
 * codeplus
 * codeminus
 * startlink
 * starlink
 * sundaycoding
 * codingsh
 * codinghs
 * sondaycoding
 * startrink
 * icerink
 * 
 * 즉 N에 있는 것들이 M에 몇 개나 있는지 확인 (이 프로그램에서 N에 중복인 문자열은 없다는 것을 가정)
 * 
 * */

public class base14 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] numbers = str.split(" ");
		
		int n = Integer.parseInt(numbers[0]);
		int m = Integer.parseInt(numbers[1]);
		int cnt = 0;
		
		String nArr[] = new String[n];
		String mArr[] = new String[m];
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		
		
		for(int i=0; i<n; i++) {
			nArr[i] = bf.readLine();
		}
		
		for(int i=0; i<m; i++) {
			mArr[i] = bf.readLine();
		}
		
		// 중복 제거한 배열로 후작업을 해주는게 어떨까
		String[] rmvDupStrArr = Arrays.stream(mArr).distinct().toArray(String[]::new);

		for(int i=0; i<n; i++) {
			for(int j=0; j<rmvDupStrArr.length; j++) {
				if(nArr[i].equals(rmvDupStrArr[j])) {
					cnt++;
				} else continue;
			}
		}
		
		
		System.out.println(cnt);
		
	}

}