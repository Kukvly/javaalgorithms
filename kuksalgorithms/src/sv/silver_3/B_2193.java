package sv.silver_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YunKukKim
 * 이친수는 1이 두번 연속으로 나오지 않음
 * 이친수는 0으로 시작하지 않음
 * 
 * 1, 10, 100, 101, 1000, 1001 ...
 * 0010101이나 101101은 각각 1, 2번 규칙에 위배되므로 이친수가 아니다.
 * N(1 ≤ N ≤ 90)이 주어졌을 때, N자리 이친수의 개수를 구하는 프로그램을 작성하시오.
 * 
 * 
 * 1. 11을 부분 문자로 갖지 않음
 * 2. 일단 n자리수에 1과 0으로 되어 있는 수들을 찾는 것이 우선
 * 
 * input
 * n: 자리수
 * 
 * output
 * rtn: 해당 자리수 내에 있는 이친수의 개수
 * 
 */

public class B_2193 {

   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int n = Integer.parseInt(br.readLine());

      long dp[] = new long[n+1];

      if(n>=1) {
         dp[1] = 1;
      } 
      if(n>=2) {
         dp[2] = 1;
      }
      for (int i=3; i<=n; i++) {
         dp[i] = dp[i-1] + dp[i-2];
      }
   
      System.out.println(dp[n]);
   }

}
