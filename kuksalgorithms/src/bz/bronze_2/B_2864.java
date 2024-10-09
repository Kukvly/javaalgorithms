package bz.bronze_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_2864 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		String a = input[0];
		String b = input[1];
		
		char maxA[] = a.toCharArray();
		char maxB[] = b.toCharArray();
		
		char minA[] = a.toCharArray();
		char minB[] = b.toCharArray();
		
		for(int i=0; i<maxA.length; i++) {
			if(maxA[i] == '5') {
				maxA[i] = '6';
			}
			
		}
		String strAx = new String(maxA);
		
		for(int i=0; i<maxB.length; i++) {
			if(maxB[i] == '5') {
				maxB[i] = '6';
			}
		}
		
		String strBx = new String(maxB);
		
		
		for(int i=0; i<minA.length; i++) {
			if(minA[i] == '6') {
				minA[i] = '5';
			}
		}
		
		String strAm = new String(minA);
		
		
		for(int i=0; i<minB.length; i++) {
			if(minB[i] == '6') {
				minB[i] = '5';
			}
		}
		String strBm = new String(minB);
		

		int rtnMax = Integer.parseInt(strAx) + Integer.parseInt(strBx);
		int rtnMin = Integer.parseInt(strAm) + Integer.parseInt(strBm);
				
		System.out.println(rtnMin + " " + rtnMax);
//		

		
		
		
		
	}

}
