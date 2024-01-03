package practice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author kukvly
 * 
 */

public class exQueue {

	public static void main(String[] args) throws IOException {
		// queue를 구현한 linkewList 생성
		Queue<String> kuksQueue = new LinkedList<>();
		
		// 요소 추가 -> kuksQueue.offer
		kuksQueue.offer("start");
		kuksQueue.offer("kim");
		kuksQueue.offer("yun");
		kuksQueue.offer("kuk");
		kuksQueue.offer("pomi");
		kuksQueue.offer("end");
		
		// 큐의 맨 앞 요소 확인 (제거 없이)
		System.out.println("-------------------------------------------");
		System.out.println("check queue first element");
		String fstElement = kuksQueue.peek();
		System.out.println("first element: " + fstElement);
		System.out.println("-------------------------------------------");
		
		// 큐의 맨 앞 요소 제거
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("remove queue first element");
		String rmvElement = kuksQueue.poll();
		System.out.println("removed element: " + rmvElement);
		System.out.println("-------------------------------------------");
		
		// 큐 요소 전체 확인
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("-------------------------------------------");
		System.out.println("check queue all element");
		System.out.println((kuksQueue.toString()));
		System.out.println("-------------------------------------------");
		
		// 큐 순회 및 출력
		System.out.println("===========================================");
		System.out.println("");
		System.out.println("kuksQueue elements: ");
		for(String elmt : kuksQueue) {
			System.out.println(elmt);
		}
	}

}

