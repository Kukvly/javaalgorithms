package references;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// BufferedReader & BufferedWriter

public class buffer {
	public static void main(String[] args) throws IOException {
		
		// BufferedReader
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();	// return 값 String으로 고정
		int i = Integer.parseInt(s); // return 값 int로 하기 위해 형변환
		
		// <1>
		// StringTokenizer에 nextToken() 함수를 쓰면 readLine()을 통해 입력받은 값을
		// 공백 단위로 구분하여 순서대로 호출할 수 있음
		StringTokenizer st = new StringTokenizer(s);
		
		// <2>
		// String.split() 함수를 활용하여 배열에 공백단위로 끊어서 데이터 넣고 사용하는 방식
		
		// ##################################################

		// BufferedWriter
		// 버퍼를 잡아놓았기 때문에 반드시 flush() / close() 를 호출하여 뒤처리를 해줘야 함
		// bw.write에는 System.out.println();과 같이 자동개행기능이 없기 때문에 개행이 필요할 경우
		// \n을 통해 따로 처리해줘야 함
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ss = "abcdefg";
		bw.write(ss+"\n");
	}	
}


