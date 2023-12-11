package silver_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 
 * @author kukvly
 * 
 *         사용하는 기타의 N개의 줄이 끊어졌다. 새 줄을 사거나 교체해야 한다. 6줄 패키지를 살 수도 있고, 1개 또는 그 이상의
 *         낱개 구매도 가능하다. 끊어진 기타줄 개수: N 기타줄 브랜드: M 각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의
 *         가격 낱개로 살 때의 가격이 주어질 때, 적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램을 작성하시오.
 * 
 *         input N M (1<=N<=100, 1<=M<=50) -> 첫째 줄 둘째 줄부터 M개의 줄에는 각 브랜드의 패키지 가격과
 *         낱개의 가격이 공백으로 구분하여 주어진다. 가격은 0보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
 * 
 *         output 첫째 줄에 기타줄을 적어도 N개 사기 위해 필요한 돈의 최솟값 출력
 * 
 *         ex. input 4 2 12 3 15 4
 * 
 *         output 12
 * 
 *         끊어진 줄 % 6 = a (패키지 가격 낱개 가격) 낱개 = b 패키지 가격 < 6 * b 6 * 패키지 낱개가격 +
 *         나머지수량 * 낱개 가격 = 낼 돈1 6 * 패키지 낱개가격 + 패키지가격 = 낼 돈2
 * 
 *         if(낼 돈1 >= 낼 돈2) 패키지가격 * 패키지수량 + (나머지수량 * 낱개가격)
 * 
 * 
 *         if(낼 돈1 < 낼 돈2) 패키지가격 * 패키지수량 + 패키지 1개 가격
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1049_a {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        int sepArr[] = new int[m];
        int packArr[] = new int[m];
        int minPack = Integer.MAX_VALUE;
        int minSep = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            int packPrice = Integer.parseInt(input[0]);
            int sepPrice = Integer.parseInt(input[1]);

            packArr[i] = packPrice;
            sepArr[i] = sepPrice;

            minPack = Math.min(minPack, packPrice);
            minSep = Math.min(minSep, sepPrice);
        }

        // 패키지만 사는 경우, 낱개만 사는 경우, 혼합해서 사는 경우 중 최소 가격 출력
        int result = Math.min(Math.min((n / 6) * minPack + (n % 6) * minSep, (n / 6 + 1) * minPack),
                n * minSep);
        System.out.println(result);
    }
}
