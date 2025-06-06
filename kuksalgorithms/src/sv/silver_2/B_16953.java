package sv.silver_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 * 연산1: nx2
 * 연산2: n*10 + 1
 * 
 * 
 * 1 <= a < b <= 10^9
 * */


public class B_16953 {

	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");

        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        
        int cnt = 1; // 최솟값 + 1
        
        while(b>a) {
        	if(b%2 ==0) {
        		b /= 2;
        	} else if(b%10 == 1) {
        		b /=10;
        	} else {
        		break;
        	}
        	
        	cnt ++;
        }
        
       if(b==a) {
    	   System.out.print(cnt);
       } else {
    	   System.out.print(-1);
       }
	}

}
