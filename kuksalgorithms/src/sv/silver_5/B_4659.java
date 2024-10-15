package sv.silver_5;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_4659 {

	static String str = "";
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			str = br.readLine();
			
			if(str.equals("end")) {
				return;
			}
			
			if(func(str)) {
				System.out.println("<" + str + "> is acceptable.");
			} else {
				System.out.println("<" + str + "> is not acceptable.");
			}
			


			
		} while(true);
	}
	
	public static boolean func(String str) {
		boolean rtn = false;
		
		int jCnt = 0;
		int mCnt = 0;
		
		char prev = ' ';
		
		for(int i=0; i<str.length(); i++) {
			char tmp = str.charAt(i);
			
			if(mChk(tmp)) {
				rtn = true;
				mCnt++;
				jCnt = 0;
			} else {
				jCnt++;
				mCnt = 0;
			}
			
			if(mCnt==3 || jCnt==3) {
				return false;
			}
			
			if(prev == tmp && tmp!='e' && tmp!='o') {
				return false;
			}
		
			prev = tmp;
		}
		
		
		return rtn;
	}
	
	public static boolean mChk(char c) {
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
	}

}
