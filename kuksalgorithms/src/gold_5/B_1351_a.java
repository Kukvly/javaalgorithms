package gold_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 
 * @author kukvly
 * 
 *         # 무한 수열 A0 = 1 Ai = A[i/P] + A[i/Q] (i>=1) -> [] 가우스기호라고 생각해야함
 * 
 *         AN을 구하는 문제 [0<=N<=10^12) (2<=P,Q<=10^9)
 * 
 *         input ex. N = 7 P = 2 Q = 3
 * 
 *         A7 = A[7/2] + A[7/3] = A [3] + A[2] A[1] = A[0] + A[0] = 2 // 고정값
 *         A[2] = A[1] + A[0] = 3 A[3] = A[1] + A[1] = 2 + 2 = 4 A7 = 7
 * 
 *         if (P==Q){
 * 
 *         }
 * 
 *         if (P>Q){
 * 
 *         }
 * 
 *
 */

// 범위 에러

public class B_1351_a {

	static HashMap<Long, Long> memo = new HashMap<>();

    static long infiniteSequence(long n, long p, long q) {
        if (n == 0) return 1;
        if (memo.containsKey(n)) return memo.get(n);

        long result = infiniteSequence(n / p, p, q) + infiniteSequence(n / q, p, q);
        memo.put(n, result);
        System.out.println("show memo: " + memo.toString());
        return result;
    }
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		long n = Long.parseLong(num[0]);
		long p = Long.parseLong(num[1]);
		long q = Long.parseLong(num[2]);

		System.out.println("kuks chk");
		System.out.println(infiniteSequence(n, p, q));
	}
}