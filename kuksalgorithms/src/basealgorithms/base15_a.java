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
 * 공백으로 구분해서 공백 앞에 있는 자리수만 name 배열에 따로 저장
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class base15_a {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 // 입력으로 문자열 집합의 크기 N과 비교할 문자열의 개수 M을 받음
        String[] input = bf.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        HashSet<String> hashSet = new HashSet<>();
        List<Object> kuksList = new ArrayList<>();
        
        String name [] = new String [n];
        String state [] = new String [n];
        String temp [] = new String[2];
        String cop [] = new String [n];
        
        String restAll[] = new String[2*n];
        
        for(int i=0; i<n; i++) {
        	restAll[i]=bf.readLine();
        	temp = restAll[0].split(" ");
        	name[i] = temp[0];
        	state[i] = temp[1];
//        	if(state[i].equals("enter") && !hashSet.contains(name[i])) {
//        		hashSet.add(name[i]);
//        	}
        	if(state[i].equals("enter") && !kuksList.contains(name[i])) {
        		kuksList.add(name[i]);
        	}
        	
        }
        System.out.println();

        System.out.println("---------------------------");
        System.out.println(restAll.toString().contains(name[0] +" enter"));
        System.out.println(restAll.toString().contains(name[0] +" leave"));
        System.out.println("---------------------------");
 
        
        int restCnt = 0;
        
        System.out.println("===========================");
        
        // 문자열 집합에 문자열들을 추가
        for (int i = 0; i < n; i++) {
        	System.out.println(restAll[i]);
        }
        System.out.println("===========================");
        
        for(int i=0; i<n; i++) {
        	if(state[i].equals("enter")) {
            	
            }
        }
        
        
        
        //String s = bf.readLine();
        
        /*
         name 배열만들고 !(name[i] +"enter" && name[i] + "leave") 이때 마다 println(name[i])을 하게끔 할 것 
         */
        
//        for (int i=0; i<n; i++) {
//        	if(nameSet.contains(name[i] + " enter") && nameSet.contains(name[i] + " leave")) {
//            	continue;
//            } else if(nameSet.contains(name[i] + " enter") && !(nameSet.contains(name[i] + " leave"))) {
//            	
//            }
//        }
        
        
	}

}
