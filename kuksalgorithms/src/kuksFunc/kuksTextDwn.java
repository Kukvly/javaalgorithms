package kuksFunc;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class kuksTextDwn {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int year = Integer.parseInt(input[0]);
		int month = Integer.parseInt(input[1]);
		
		String filePath = "/Users/kukvly/Documents/";
		String fileName = year +"Y"+ month +"M_TestTxt";
	
		try (PrintWriter pr = new PrintWriter(new FileWriter(filePath+fileName))){
			for (int i=0; i<10; i++) {
				System.out.println("테스트용 프린트 문_" + i);
				pr.println("테스트용 프린트 문_" + i);
			}
			System.out.println("====================================");
			System.out.println(fileName + "파일이 " + filePath + "경로에 정상적으로 다운로드 되었습니다.");
			System.out.println("====================================");
			
			pr.println("====================================");
			pr.println(fileName + "파일이 " + filePath + "경로에 정상적으로 다운로드 되었습니다.");
			pr.println("====================================");
			
		}catch(IOException e) {
			System.err.println("파일 처리 중 오류 발생" + "\n: " + e.getMessage());
		}
	}

}
