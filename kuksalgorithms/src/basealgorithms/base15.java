package basealgorithms;

/**
 * 7785
 * 첫째 줄: 출입 기록 수 n
 * 
 * 1<name.length < 6
 * 동명이인 없음
 * 
 * leave: 출
 * enter: 입
 * 
 * ex.
 * 4
 * Baha enter
 * Askar enter
 * Baha leave
 * Artem enter
 * 
 * Askar 회사에 있음
 * Artem 회사에 있음
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class base15 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 // 입력으로 문자열 집합의 크기 N과 비교할 문자열의 개수 M을 받음
        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String name [] = new String [5];
        
        for (int i=0; i<name.length; i++) {
        //	name[i] = 
        }
        
        HashSet<String> nameSet = new HashSet<>();

        // 문자열 집합에 문자열들을 추가
        for (int i = 0; i < n; i++) {
            nameSet.add(bf.readLine());
        }
        System.out.println(nameSet.toString());
        //String s = bf.readLine();
        
        /*
         name 배열만들고 !(name[i] +"enter" && name[i] + "leave") 이때 마다 println(name[i])을 하게끔 할 것 
         */
	}

}
