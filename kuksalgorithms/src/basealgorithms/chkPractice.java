package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class chkPractice {
	public static void main(String[] args) throws IOException {
		int ss = 682380;		// 삼성
		int sh = 1388846;	// 신한
		int hd = 103447;
		int ncg = 125000;
		int jgc = 125000;
		int jg = 500000;
		
		double sum = ss+sh+hd+ncg+jgc+jg;
		
		double wg = 2766500;
		
		System.out.println(sum);
		
		System.out.println(sum - wg);
		
		
		String arr[][]={{"a", "b", "c","f","qq"},
                {"a", "e", "q","f","qq"},
                {"a", "h", "i","f","qq"},
                {"b", "b", "c","f","qq"},
                {"b", "e", "s","f","qq"},
                {"b", "h", "I","f","qq"}};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][3]);
		
		System.out.println("---------------------------------------------------");
		
		List<Object> kuksList = new ArrayList<>();
		kuksList.add("ff");
		kuksList.add("qq");

		System.out.println(kuksList.contains(arr[0][4]));
		
		
		for(Object element: kuksList) {
			System.out.println("element: "+ element);
		}
		
	}
}
