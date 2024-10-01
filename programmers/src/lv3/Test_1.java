package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*

2~100 자연수 하나 지정 -> n

condition
1. n보다 작거나 같은 숫자 카드들을 준비

2. 준비한 카드의 수만큼 작은 상자를 준비 (n보다 작거나 같은 숫자 카드의 개수 = 상자 개수)


상자 1 2 3 4 5 6 7 8
카드 8 6 3 7 2 5 1 4

1번 그룹
8 -> 4
4 -> 7
7 -> 1
1 -> 8

2번 그룹
2 -> 6
6 -> 5
5 -> 2

3번 그룹
3 -> 3



*/

public class Test_1 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cards[] = new int [n];
		int boxs[] = new int [n+1];
		String input[] = br.readLine().split(" ");
		for (int i=0; i<n; i++) {
			cards[i] = Integer.parseInt(input[i]);
		}
		System.out.println(cards[8]);
//		System.out.println(solution(cards));
	}
	
	



	    public int solution(int[] cards) {
	        // cards[i] -> i+1번 상자에 담긴 카드에 적힌 숫자
	        for (int i=0; i<cards.length; i++){
	            cards[i] = 0;
	        }
	        
	        
	        int answer = 0;
	        return answer;
	    }
	

}
