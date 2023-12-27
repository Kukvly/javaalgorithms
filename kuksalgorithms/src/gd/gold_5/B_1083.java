package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author kukvly
 * 크기가 N인 배열 A가 있다. 배열에 있는 모든 수는 서로 다르다.
 * 이 배열을 소트할 때, 연속된 두 개의 원소만 교환할 수 있다.
 * 그리고, 교환은 많아봐야 S번 할 수 있다.
 * 이때, 소트한 결과가 사전순으로 가장 뒷서는 것을 출력한다.
 * 
 * input
 * 첫째 줄에 N이 주어진다. N은 50보다 작거나 같은 자연수이다.
 * 둘째 줄에는 각 원소가 차례대로 주어진다.
 * 이 값은 1000000보다 작거나 같은 자연수이다.
 * 마지막 줄에는 S가 주어진다.
 * S는 1000000보다 작거나 같은 음이 아닌 정수이다.
 * 
 * output
 * 첫째 줄에 문제의 정답을 출력한다.
 * 
 * 
 * 7
 * 10 20 30 40 50 60 70
 * 1
 * 
 * 20 10 30 40 50 60 70
 * 
 * 
 * 5
 * 3 5 1 2 4
 * 2
 * 
 * 5 3 2 1 4
 * 
 * 
 * 10
 * 19 20 17 18 15 16 13 14 11 12
 * 5
 * 
 * 20 19 18 17 16 15 14 13 12 11
 *
 */
public class B_1083 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input[] = br.readLine().split(" ");
		
	}

}
