package practice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class exQueue {

	public static void main(String[] args) throws IOException {
		// queue를 구현한 linkewList 생성
		Queue<String> kuksQueue = new LinkedList<>();
		
		// Queue에 요소가 있는지 없는지 확인
		System.out.println("kuksQueue is empty?: " + kuksQueue.isEmpty());
		
		// 요소 추가 -> kuksQueue.offer
		kuksQueue.offer("start");
		
		System.out.println("kuksQueue is empty?: " + kuksQueue.isEmpty());
		
		kuksQueue.offer("kim");
		kuksQueue.offer("yun");
		kuksQueue.offer("kuk");
		kuksQueue.offer("pomi");
		kuksQueue.offer("end");
		
		// 큐의 맨 앞 요소 확인 (제거 없이) -> FIFO 이기 때문에 맨 앞 요소를 확인
		System.out.println("-------------------------------------------");
		System.out.println("check queue first element");
		String fstElement = kuksQueue.peek();
		System.out.println("first element: " + fstElement);
		System.out.println("-------------------------------------------");
		
		// 큐의 맨 앞 요소 제거 -> 제거할 맨 앞 요소를 rmvElement에 저장
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
		
		System.out.println("kuksQueue is empty?: " + kuksQueue.isEmpty());
		
		// 큐 삭제
		System.out.println((kuksQueue.toString()));
		// 큐의 Front 삭제
		kuksQueue.remove();
		System.out.println((kuksQueue.toString()));
		// 특정 요소 삭제
		kuksQueue.remove("end");
		System.out.println((kuksQueue.toString()));
		// 전체 삭제
		kuksQueue.removeAll(kuksQueue);
		System.out.println((kuksQueue.toString()));		
	}

}

