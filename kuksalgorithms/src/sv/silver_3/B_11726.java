package sv.silver_3;

/**
 * 2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수를 구하라.
 * 
 * ex. 2x5 채운 방법
 * 1x2 1x2 2x1 2x1 1x2
 * 
 * 방법의 수를 10,007로 나눠라
 * 
 * dp[1] = 1
 * dp[2] = 2
 * dp[3] = 3
 * dp[4] = 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_11726 {

   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());
      
      long dp[] = new long[n+1];
      
      if(n>=1) dp[1] = 1;
      if(n>=2) dp[2] = 2;
      
      for (int i=3; i<=n; i++) {
         dp[i] = (dp[i-1] + dp[i-2])%10007;
      }
      
      System.out.println((int)dp[n]);
   }

}
