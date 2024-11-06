package pccp.mogo1;

/*
ability [n][m]

1<=n<=10 // n:학생수
1<=m<=n. // m:종목수 (m<=n)

0<=ability[i][j]<=10000

ability[0][0] -> 1번학생의 1번 종목에 대한 능력치

test case1
5 3
40 10 10
20 5 0
30 30 30
70 0 70
100 100 100

>> 210

test case2
3 2
20 30
30 20
20 30

>> 60
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class mogo1_2 {
	
    public static void main(String[] args) {
        
        // 예시 입력
        int[][] ability = {
            {40, 10, 10},
            {20, 5, 0},
            {30, 30, 30},
            {70, 0, 70},
            {100, 100, 100}
        };
        
        int [][] ability1 = {
        	{20, 30}, 
        	{30, 20}, 
        	{20, 30}
        };

        
        // 결과 출력
        System.out.println(solution(ability));  // 출력: 210
        System.out.println(solution(ability1));  // 출력: 60

    }
    public static int solution(int[][] ability) {
        int n = ability.length;  // 학생 수
        int m = ability[0].length;  // 종목 수
        boolean[] selected = new boolean[n];  // 학생 선택 여부
        return findMax(ability, selected, 0, 0);
    }
    
    // 백트래킹을 이용한 능력치 합 최대화
    /*
     * @param
     * 1. ability[][]
     * 2. selected[]  -> 방문 여부 
     * 3. idx -> 인덱스
     * 4. currentSum -> 현재합
     * */
    private static int findMax(int[][] ability, boolean[] selected, int idx, int currentSum) {
        // 모든 종목을 다 처리한 경우
        if (idx == ability[0].length) {
            return currentSum;
        }
        
        int maxSum = 0;
        
        // 각 학생에 대해 백트래킹을 진행
        for (int i = 0; i < ability.length; i++) {
            if (!selected[i]) {  // 아직 선택되지 않은 학생일 경우
                selected[i] = true;  // 학생 선택
                int newSum = findMax(ability, selected, idx + 1, currentSum + ability[i][idx]);
                maxSum = Math.max(maxSum, newSum);  // 최대값 갱신
                selected[i] = false;  // 백트래킹
            }
        }
        
        return maxSum;
    }
    

}

