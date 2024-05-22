package gd.gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1806 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String input [] = br.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int s = Integer.parseInt(input[1]);
		
		long arr[] = new long [n];
		
		input = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		int minLength = Integer.MAX_VALUE;
		int sum=0, start=0;
		
		for(int end=0; end<n; end++) {
			sum+=arr[end];
			
			while(sum>=s) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start++];
			}
		}
		
		
	    if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
	}

}
