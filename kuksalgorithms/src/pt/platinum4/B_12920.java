package pt.platinum4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B_12920 {

    static class Item {
        int weight, value;

        Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 물건 종류 수
        int maxWeight = Integer.parseInt(st.nextToken()); // 가방 최대 무게
        ArrayList<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken()); // 물건의 무게
            int value = Integer.parseInt(st.nextToken()); // 만족도 (=가중치)
            int count = Integer.parseInt(st.nextToken()); // 물건의 개수

            int pow = 1;
            while (count >= pow) {
                items.add(new Item(weight * pow, value * pow));
                count -= pow;
                pow *= 2;
            }
            if (count > 0) {
                items.add(new Item(weight * count, value * count));
            }
        }

        int[] dp = new int[maxWeight + 1];

        // DP 수행
        for (Item item : items) {
            int weight = item.weight;
            int value = item.value;

            for (int j = maxWeight; j >= weight; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight] + value);
            }
        }

        System.out.println(dp[maxWeight]);
    }
}
