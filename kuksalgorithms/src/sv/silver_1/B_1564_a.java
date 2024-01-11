package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_1564_a {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long result = factorial(n);
        System.out.println(getLastFiveDigits(result));
    }

    public static long factorial(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result = (result * i) % 1000000;  // Keep only the last six digits
            while (result % 10 == 0) {
                result /= 10;
            }
        }
        return result % 1000000;
    }

    public static String getLastFiveDigits(long num) {
        String resultStr = String.valueOf(num);
        int startIndex = Math.max(0, resultStr.length() - 5);
        return resultStr.substring(startIndex);
    }
}