package silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * svN: 설문조사 문항 수
 * ppN: 설문에 응한 사람 수
 * 0 <= ppN <= 10
 * 
 * 설문조사를 모두 마친 후 유진이는 각 문항의 평균 점수의
 * 소수점 셋째 자리에서 자른 값을 보고서 종이에 적고 사무실로 돌아왔다.
 * 예를 들어, 어떤 문항에 각 사람이 점수를 4, 6, 10점으로 대답했다면,
 * 평균 점수는 6.666이다.
 * 
 * 이제 설문조사 결과를 보고해야 하는데, 문제가 하나 생겼다.
 * 평균 점수만 알고 있기 때문에, 설문조사에 참여한 사람의 수를 알 수 없다는 점이다.
 * 각 문항의 평균 점수가 주어진다. 이 때, 설문조사에 참여한 사람의 수를 구해보자
 * 
 * input
 * 첫째 줄에 N이 주어진다. 둘째 줄부터 N개의 줄에 각 문항의 평균 점수가 주어진다.
 * N은 50보다 작거나 같은 자연수이고
 * 0 <= 평균 점수 <= 10 (평균 점수는 소수임)
 * 항상 소수점 셋째 자리까지 주어진다. 
 * 
 * output
 * 첫째 줄에 설문조사에 참여한 사람의 수를 출력한다.
 * 만약, 가능한 정답이 여러가지라면, 가장 작은 값을 출력한다.
 * 
 **/

public class B_1206 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputN[] = br.readLine().split(" ");
		int n = Integer.parseInt(inputN[0]);
		
		double inputSum = 0;
		double inputAvg = 0;
		
		for(int i=0; i<n; i++) {
			double avgElement = Double.parseDouble(br.readLine());
			inputSum += avgElement;
		}
		inputAvg = inputSum/n;
		
		System.out.println("inputAvg: "+inputAvg);
		System.out.println("inputAvg/8: "+(inputAvg/8));
		System.out.println("inputAvg%8: "+(inputAvg%8));
		
		 
	}

}
