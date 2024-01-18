package sv.silver_5;

/*
 * 피제수(분자): a
 * 제수(분모): b
 * 소숫점 아래 n번째 자리수 구하기
 * ex. a=3, b=4, n=1 -> 0.75 -> 7
 * 
 * input -> (1<=a,b<=100,000), (1<=n<=1,000,000)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1312 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);

        if (a % b == 0) {
            System.out.println(0);
        } else {
            a %= b;
            int result = 0;
            for (int i = 0; i < n; i++) {
                a *= 10;
                result = a / b;
                a %= b;
            }
            System.out.println(result);
        }
    }
}
