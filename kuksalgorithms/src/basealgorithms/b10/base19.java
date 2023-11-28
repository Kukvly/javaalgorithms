package basealgorithms.b10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author kukvly
 * 
 *         [1764] 듣도 못한 사람 수: N 보도 못한 사람 수: M
 * 
 *         input n m n1 n2 n3 m1 m2 m3 m4
 */

public class base19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int cnt = 0;

		String dName[] = new String[n];

		Set<String> bSet = new HashSet<>();
		Set<String> dbSet = new HashSet<>();

		for (int i = 0; i < n; i++) {
			dName[i] = br.readLine();
		}
//		Arrays.sort(dName, Collections.reverseOrder());

		for (int j = 0; j < m; j++) {
			bSet.add(br.readLine());
//			if (bSet.contains(dName[j])) {
//				dbSet.add(dName[j]);
//				cnt++;
//			}
		}
		
		Arrays.sort(bSet.toArray(), Collections.reverseOrder());
		
		for (int j=0; j<n; j++) {
			if (bSet.contains(dName[j])) {
				dbSet.add(dName[j]);
				cnt++;
			}
		}

		System.out.println(cnt);

		for (int i = 0; i < dbSet.toArray().length; i++) {
			System.out.println(dbSet.toArray()[i]);
		}


	}

}