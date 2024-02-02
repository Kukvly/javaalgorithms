package kuksFunc;

public class timeFunc {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		// functionA part
		/*
		 * 
		 */
		long endTime = System.currentTimeMillis();
		System.out.println("functionA 소요 시간 : " + (endTime - startTime));
        
		System.out.println();
		System.out.println();
		System.out.println();

		startTime = System.currentTimeMillis();
		// functionB part
		/*
		 * 
		 */
		endTime = System.currentTimeMillis();
		System.out.println("functionB 소요 시간 : " + (endTime - startTime));
		}

}
