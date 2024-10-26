package dynamicPrgm;

import java.io.*;

/*
 * 오토에버스러운 문제?!
 * 
 * 
 * */


public class B_2096 {
	static int n;
	
	static int maxDp[];
	static int minDp[];
	static int tmpMax[];
	static int tmpMin[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		maxDp = new int[3];
		minDp = new int[3];
		tmpMax = new int[3];
		tmpMin = new int[3];
		
		String input[] = br.readLine().split(" ");
		
		for(int i=0; i<3; i++) {
			maxDp[i] = Integer.parseInt(input[i]);
			minDp[i] = Integer.parseInt(input[i]);
		}
		
		for(int i=1; i<n; i++) {
			input = br.readLine().split(" ");
			for (int j=0; j<3; j++) {
				tmpMax[j] = Integer.parseInt(input[j]);
				tmpMin[j] = Integer.parseInt(input[j]);
			}
			
			
			tmpMax[0] += Math.max(maxDp[0], maxDp[1]);
			tmpMax[1] += Math.max(Math.max(maxDp[0], maxDp[1]), maxDp[2]);
			tmpMax[2] += Math.max(maxDp[1], maxDp[2]);
			
			tmpMin[0] += Math.min(minDp[0], minDp[1]);
			tmpMin[1] += Math.min(Math.min(minDp[0], minDp[1]), minDp[2]);
			tmpMin[2] += Math.min(minDp[1], minDp[2]);
			
			for(int j=0; j<3; j++) {
				maxDp[j] = tmpMax[j];
				minDp[j] = tmpMin[j];
			}
		}
		int maxRtn = Math.max(maxDp[0], Math.max(maxDp[1], maxDp[2]));
		int minRtn = Math.min(minDp[0], Math.min(minDp[1], minDp[2]));
		
		bw.write(String.valueOf(maxRtn) + " " + String.valueOf(minRtn));
		bw.close();
		
	}

}
