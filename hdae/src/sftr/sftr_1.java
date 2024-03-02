package sftr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author kukvly 대회 3개 n <= 100,000 grade: 0~1000 공동순위 가능 (공동 1등이 나오면 그다음은 2등이
 *         아니라 3등) 나보다 점수 높은 사람 수 + 1= 내 등수 각 대회에서의 내 등수1 각 대회에서의 내 등수2 각 대회에서의
 *         내 등수3
 * 
 *         총점으로 산출하는 내 등수
 * 
 *         <input> 
 *         4 // n 
 *         40 78 36 // 내 점수
 *         10 20 30 50 // grade1
 *         40 50 60 10 // grade2
 *         29 94 24 100 // grade3
 * 
 *         <output> 
 *         grade1 // 내 등수1
 *         grade2 // 내 등수2
 *         grade3 // 내 등수3
 * 
 *         총점 // 총점에 대한 내 등수
 * 
 */

public class sftr_1 {
	static List<Integer> list1 = new ArrayList<Integer>();
	static List<Integer> list2 = new ArrayList<Integer>();
	static List<Integer> list3 = new ArrayList<Integer>();
	static List<Integer> totalList = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> queue1 = new LinkedList<Integer>();
		Queue<Integer> queue2 = new LinkedList<Integer>();
		Queue<Integer> queue3 = new LinkedList<Integer>();
		
		String input[] = br.readLine().split(" ");
		int my1 = Integer.parseInt(input[0]);
		int my2 = Integer.parseInt(input[1]);
		int my3 = Integer.parseInt(input[2]);
		
		int total = my1 + my2 + my3;
		
		int cnt = 0;
		
		for(int i=0; i<3; i++) {
			input = br.readLine().split(" ");
			
			if(i==0) {
				for(int j=0; j<n; j++) {
					queue1.add(Integer.parseInt(input[j]));
					list1.add(Integer.parseInt(input[j]));
				}
				
				// queue1 연산 logic
				
				// 순위 정렬 후 내 점수랑 같은지 체크
				if(list1.contains(my1)) {
					Collections.sort(list1);
					list1.add(list1.indexOf(my1), my1);
					System.out.println(list1.indexOf(my1));
				} else {
					list1.add(my1);
					Collections.sort(list1);
					System.out.println(list1.indexOf(my1)+1);
				}
			} else if (i==1) {
				for(int j=0; j<n; j++) {
					queue2.add(Integer.parseInt(input[j]));
					list2.add(Integer.parseInt(input[j]));
				}
				
				// queue2 연산 logic
				if(list2.contains(my2)) {
					Collections.sort(list2);
					list2.add(list2.indexOf(my2), my2);
					System.out.println(list2.indexOf(my2));
				} else {
					list2.add(my2);
					Collections.sort(list2);
					System.out.println(list2.indexOf(my2)+1);
				}
			
			} else if (i==2) {
				for(int j=0; j<n; j++) {
					queue3.add(Integer.parseInt(input[j]));
					list3.add(Integer.parseInt(input[j]));
				}
				
				// queue3 연산 logic
				if(list3.contains(my3)) {
					Collections.sort(list3);
					list3.add(list3.indexOf(my3), my3);
					System.out.println(list3.indexOf(my3));
				} else {
					list3.add(my3);
					Collections.sort(list3);
					System.out.println(list3.indexOf(my3)+1);
				}
			}
		}
		
			// 최종 연산 logic
			// 총합들 공동순위 반영하여 순위 매기기
			for(int i=0; i<n; i++) {
				totalList.add(list1.get(i) + list2.get(i) + list3.get(i));
				if(totalList.contains(total)) {
					cnt++;
				}
			}
			
			if (cnt > 1) {
				System.out.println("cnt: " + cnt);
				System.out.println(totalList.indexOf(total));
			} else {
				Collections.sort(totalList);
				System.out.println(totalList.indexOf(total));
			}
		
	}

}
