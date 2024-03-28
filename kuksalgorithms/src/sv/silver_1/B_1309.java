package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1309 {

   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      final int MOD = 9901;
      
      int n = Integer.parseInt(br.readLine());
      
      /*
       * j=0 -> 동물 X
       * j=1 -> 첫칸에 동물
       * j=2 -> 둘칸에 동물
       */
      long dp[][] = new long[n+1][3];
      
      // 초기값 설정
      dp[1][0] = dp[1][1] = dp[1][2] = 1;
      
      for (int i=2; i<=n; i++) {
         dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % MOD;
         dp[i][1] = dp[i-1][0] + dp[i-1][2] % MOD;
         dp[i][2] = dp[i-1][0] + dp[i-1][1] % MOD; 
      }
      
      System.out.print(dp[n][0] + dp[n][1] + dp[n][2]);
   }

}
