package sv.silver_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<Integer>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String input[] = br.readLine().split(" ");
			if (input.length == 2) {
				queue.add(Integer.parseInt(input[1]));
			} else {
				if (input[0].equals("pop")) {
					if (queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(queue.remove());
					}
				} else if (input[0].equals("size")) {
					System.out.println(queue.size());
				} else if (input[0].equals("empty")) {
					if (queue.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
				} else if (input[0].equals("front")) {
					if (queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(queue.peek());
					}
				} else if (input[0].equals("back")) {
					if (queue.isEmpty()) {
						System.out.println(-1);
					} else {
						System.out.println(((LinkedList<Integer>) queue).getLast());
					}
				}
			}
		}
	}
}
