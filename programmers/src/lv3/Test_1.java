package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*

2~100 자연수 하나 지정 -> n

condition
1. n보다 작거나 같은 숫자 카드들을 준비

2. 준비한 카드의 수만큼 작은 상자를 준비 (n보다 작거나 같은 숫자 카드의 개수 = 상자 개수)


상자 0 1 2 3 4 5 6 7 8
카드 0 8 6 3 7 2 5 1 4

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
		int cards[] = new int [n+1];
		int boxs[] = new int [n+1];
		
		cards[0] = boxs[0] = 0;
		
		String input[] = br.readLine().split(" ");
		for (int i=1; i<=n; i++) {
			cards[i] = Integer.parseInt(input[i-1]);
			boxs[i] = i;
		}
			
		// logic
		// cards -> 배열의 요소를 인덱스를 삼아 이 배열의 또다른 요소를 참조하고
		// 참조한 요소의 값이 또 인덱스가 되어 새로운 요소를 참조하다가
		// 최종적으로 배열의 첫 인덱스와 배열의 요소가 같아지는 순간 그룹 지정
		
//		for (int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				if(cards[j] == j) {
//					
//				}
//			}
//		}
		
//		System.out.println(cards[8]);
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
