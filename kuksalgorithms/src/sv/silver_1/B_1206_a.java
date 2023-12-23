package sv.silver_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_1206_a {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 문항의 개수
		int pplArr[] = new int[N];
		// 각 문항의 평균 점수 배열
		double[] averageScores = new double[N];
		for (int i = 0; i < N; i++) {
			averageScores[i] = Double.parseDouble(br.readLine()); // 문항의 개수
		}

		// 각 문항의 평균 점수를 기반으로 사람의 수 계산
		for (int i = 0; i < N; i++) {
			int people = calculatePeople(averageScores[i]);
//			System.out.println(people);
			pplArr[i] = people;
		}
		
		Arrays.sort(pplArr);
		
		System.out.println(pplArr[0]);
	}

	// 평균 점수를 기반으로 사람의 수 계산하는 함수
	private static int calculatePeople(double averageScore) {
		// 평균 점수를 기반으로 소수점 셋째 자리에서 자름
		averageScore = Math.round(averageScore * 1000) / 1000.0;

		// 사람의 수를 구함
		int people = 0;
		int minPeople = Integer.MAX_VALUE;

		while (Math.round(people * averageScore) / (double) people != averageScore) {
			people++;

			// 가장 작은 값을 저장
			if (Math.round(people * averageScore) / (double) people == averageScore) {
				minPeople = Math.min(minPeople, people);
			}
		}

		return minPeople;
	}
}