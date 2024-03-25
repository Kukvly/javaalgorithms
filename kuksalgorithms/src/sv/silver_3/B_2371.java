package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B_2371 {
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
        int n = Integer.parseInt(br.readLine()); // 파일 개수
        List<Object> kuksList = new ArrayList<Object>();
        for(int i=0; i<n; i++) {
        	String input[] = br.readLine().split(" ");
        	
        	System.out.println("input.length: " + input.length);
        	List<Integer> paramList = new ArrayList<Integer>();
        	for (int j=0; j<input.length;j++) {
        		paramList.add(Integer.parseInt(input[j]));
        	}
        	kuksList.add(paramList);
        	System.out.println(paramList.toString());
        }
        
        System.out.print(kuksList.size());
        
    }
}
