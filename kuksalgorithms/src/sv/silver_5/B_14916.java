package sv.silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_14916 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int coin2=0;
		int coin5=0;
		if(n==1 || n==3) {
			System.out.println(-1);
			 return;
		}
		else if(n%5 == 0){
			coin5 = (int)n/5;
			System.out.println(coin5);
			return;
		} else if((n%5)%2==0){
			coin5 =  n/5;
			int tmp =  n%5;
			coin2 = tmp/2;
			
			System.out.println(coin5+coin2);
		} else if((n%5)%2==1) {
			if(((n%5)+5)%2==0) {
				coin5 = (n/5) -1;
				int tmp = (n%5) +5;
				coin2 = tmp/2;
				System.out.println(coin2 + coin5);
					
			} else {
				System.out.println(-1);
			}
		}
	}

}
