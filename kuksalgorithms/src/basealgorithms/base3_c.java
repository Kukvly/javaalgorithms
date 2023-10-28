package basealgorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class base3_c {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String n = bf.readLine();
		StringTokenizer s1 = new StringTokenizer(n);
		
		String cd = bf.readLine();
		StringTokenizer st1 = new StringTokenizer(cd, " ");

		String n1 = bf.readLine();
		StringTokenizer s2 = new StringTokenizer(n1);
		
		String sp = bf.readLine();
		StringTokenizer st2 = new StringTokenizer(sp, " ");
		
		int cdn = Integer.valueOf(s1.nextToken());
		int[] card = new int[cdn];
		
		int sn = Integer.valueOf(s2.nextToken());
		int[] sep = new int[sn];
		
		int[] tmp = new int[sn];

		for (int i = 0; i < sep.length; i++) {
			sep[i] = Integer.valueOf(st2.nextToken());
			tmp[i] = 0;

			for (int j = 0; j < card.length; j++) {
				card[j] = Integer.valueOf(st1.nextToken());
				if (sep[i] == card[j]) {
					tmp[i] = 1;
				}
			}
			System.out.print(tmp[i] + " ");
		}
	}
}