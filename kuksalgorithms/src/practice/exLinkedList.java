package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author kukvly
 * LinkedList의 가장 큰 특징은, ArrayList와 다르게 중간에 데이터가 추가되거나
 * 중간에 있는 데이터가 삭제되어도 앞으로 땡기거나 뒤로 미는 동작이 없다는 점이다.
 * 추가되거나 삭제될 노드 위치의 바로 앞뒤쪽에 있는 노드의 참조를 변경하기만하면 된다.
 * 또한 LinkedList는 배열과 달리 할당이 고정된 크기 개념이 아니기 때문에 메모리가
 * 충분하다면 요소를 계속해서 저장 할 수 있다.

 */

public class exLinkedList {

	public static void main(String[] args) throws IOException {
		LinkedList<Integer> klList = new LinkedList<>();
		
		LinkedList<Integer> klList2 = new LinkedList<Integer>(Arrays.asList(1,2));
		
		LinkedList<String> klList3 = new LinkedList<String>(Arrays.asList("kim", "yun", "kuk", "pomi"));
	
	// O(1)	
		// 가장 앞에 데이터 추가
		klList3.addFirst("dev");
		// 가장 뒤에 데이터 추가
		klList2.addLast(999);
		System.out.println(klList3.toString());
		System.out.println(klList2.toString());
	// O(n)
		klList3.add(1, "job"); // n번째 인덱스 바로 앞에 데이터 추가
		System.out.println(klList3.toString());
		Queue<Integer> kQueue = new LinkedList<>();
		
		klList.add(1);
		klList.add(2);
		klList.add(3);
		klList.add(4);
		
		int kuksArr[] = new int [klList.size()];

		for (int i=0; i<klList.size(); i++) {
			kuksArr[i] = klList.get(i);
		}

		System.out.println(Arrays.toString(kuksArr));
		
		System.out.println("---------------------------1");
		
		for (int i: kuksArr) {
			System.out.println("i: " + i);
//			System.out.println("klList.get(" + i + "): " + klList.get(i));
		}

		
		System.out.println("---------------------------2");
	}

}

