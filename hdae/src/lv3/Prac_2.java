package lv3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author kukvly
 * 루돌프 월드컵
 * 루돌프 후보는 넷
 * 축구 월드컵 리그 경기를 통해 상위 2마리 선발
 * 
 * 산타는 이미 1번을 마음에 들어함
 * 1번 루돌프가 선택될 확률을 구하고 싶어함
 * 
 * i번 루돌프와, j번 루돌프의 축구 경기 결과
 * 
 * i번 루돌프 이길 확률 -> 5Fi + (5Fj * 4Fi)
 * j번 루돌프 이길 확률 -> 5Fi + (5Fj * 4Fj)
 * 둘이 비길 확률 ->      5Fi + (5Fj * Fi) + Fj
 * 
 * 리그 경기에서 모든 루돌프끼리 정확히 1번씩 경기 진행한 후 승점 합산하여 등수 매
 * 각 경기마다 승리시 3점, 비겼을 시 1점, 졌을 시 0점 얻게 됨
 * 
 * 최종 점수가 동일한 경우 번호가 작은 루돌프가 더 높은 순위임. -> 이 때, 1번 루돌프가 선택될 확률은?
 * 
 * 출력: 첫 번째 줄에 1번 루돌프가 상위 2등 안에 들어 선택될 확률(%)을 소수점 셋째자리까지 반올림하여 출력
 * 
 * 1. 셋째자리까지 반올림 -> (Math.round(n * 1000)/ 1000.0)
 * 2. System.out.printf("%.3f", param); -> 더 좋은 풀이
 */

public class Prac_2 {
	
	// 0 win
    // 1 lose
    // 2 draw

    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static Pair[] arr = {
        new Pair(0, 0),
        new Pair(1, 2),
        new Pair(1, 3),
        new Pair(1, 4),
        new Pair(2, 3),
        new Pair(2, 4),
        new Pair(3, 4)
    };

    static double rtn;
    static double[] F = new double[5];
    static double[][][] prob = new double[6][6][3];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        for (int i = 1; i <= 4; i++) {
            F[i] = Integer.parseInt(input[i-1]);
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == j) continue;
                
                prob[i][j][0] = F[i] * 4.0 / (F[i] * 5.0 + F[j] * 5.0);
                prob[i][j][1] = F[j] * 4.0 / (F[i] * 5.0 + F[j] * 5.0);
                prob[i][j][2] = (F[i] + F[j]) / (F[i] * 5.0 + F[j] * 5.0);
            }
        }

        List<Integer> score = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        dfs(0, -1, 1.0, score);

        rtn = rtn * 100_000.0;
        rtn = Math.round(rtn);
        rtn = rtn / 1000.0;

        System.out.println(rtn);
    }
    
    public static void dfs(int k, int rst, double tot, List<Integer> score) {
        int a = arr[k].first;
        int b = arr[k].second;
        double p = (rst == -1) ? 1.0 : prob[a][b][rst];

        List<Integer> tmp = new ArrayList<>(score);

        if (rst == 0) {
            score.set(a, score.get(a) + 3);
        } else if (rst == 1) {
            score.set(b, score.get(b) + 3);
        } else if (rst == 2) {
            score.set(a, score.get(a) + 1);
            score.set(b, score.get(b) + 1);
        }

        if (k == 6) {
            List<Integer> f = new ArrayList<>(score);
            Collections.sort(f.subList(1, f.size()));
            if (score.get(1) >= f.get(3)) {
                rtn += tot * p;
            }
        } else {
            dfs(k + 1, 0, tot * p, score);
            dfs(k + 1, 1, tot * p, score);
            dfs(k + 1, 2, tot * p, score);
        }
        
        score.clear();
        score.addAll(tmp);
    }
}